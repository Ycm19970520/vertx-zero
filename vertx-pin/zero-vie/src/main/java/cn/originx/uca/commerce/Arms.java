package cn.originx.uca.commerce;

import cn.originx.refine.Ox;
import cn.originx.scaffold.plugin.AspectSwitcher;
import cn.originx.uca.log.TrackIo;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.tp.atom.modeling.data.DataAtom;
import io.vertx.tp.atom.refine.Ao;
import io.vertx.tp.modular.dao.AoDao;
import io.vertx.up.atom.record.Apt;
import io.vertx.up.commune.element.JSix;
import io.vertx.up.commune.exchange.DiFabric;
import io.vertx.up.eon.em.ChangeFlag;
import io.vertx.up.fn.Fn;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
@SuppressWarnings("all")
public class Arms {

    private final static ConcurrentMap<String, Arms> POOL_ARMS = new ConcurrentHashMap<>();
    private final transient DataAtom atom;
    private final transient AoDao dao;
    private final transient TrackIo io;
    private final transient Set<ChangeFlag> types = new HashSet<ChangeFlag>() {
        {
            this.add(ChangeFlag.DELETE);
            this.add(ChangeFlag.UPDATE);
            this.add(ChangeFlag.ADD);
        }
    };
    private transient DiFabric fabric;

    private Function<JsonArray, JsonArray> fnDefault;
    private Supplier<Future<JsonArray>> fnFetcher;

    public Arms(final AoDao dao, final DataAtom atom) {
        this.dao = dao;
        this.atom = atom;
        this.io = TrackIo.create(atom, dao);
    }

    public static <T extends Arms> T create(final AoDao dao, final DataAtom atom) {
        return (T) Fn.pool(POOL_ARMS, atom.identifier(), () -> new Arms(dao, atom));
    }

    protected DataAtom atom() {
        return this.atom;
    }

    protected AoDao dao() {
        return this.dao;
    }

    public <T extends Arms> T bind(final DiFabric fabric) {
        this.fabric = fabric;
        return (T) this;
    }

    public <T extends Arms> T bind(final ChangeFlag... types) {
        this.types.clear();
        this.types.addAll(Arrays.asList(types));
        return (T) this;
    }

    public <T extends Arms> T bindFn(final Function<JsonArray, JsonArray> fnDefault) {
        this.fnDefault = fnDefault;
        return (T) this;
    }

    public <T extends Arms> T bindFn(final Supplier<Future<JsonArray>> fnFetcher) {
        this.fnFetcher = fnFetcher;
        return (T) this;
    }

    /*
     * 两种方式读取数据
     * 1. 带条件
     * 2. 不带条件
     */
    public Future<JsonArray> saveAsync(final JsonArray recordData, final JsonObject options) {
        return this.saveAsync(null, recordData, options);
    }

    public Future<JsonArray> saveAsync(final JsonObject criteria, final JsonArray recordData, final JsonObject options) {
        Ao.infoUca(this.getClass(), "原始输入数据：{0}，原始配置：{1}", recordData.encode(), options.encode());
        /*
         * 构造 AoHex
         * {
         *     "components": {
         *     }
         * }
         */
        final JSix hex = JSix.create(options);
        /*
         * 第一步：清洗数据
         * 1）检查数据合法性
         * 2）写日志、做过滤
         * Record[] -> JsonArray
         */
        return this.fetchAsync(criteria)

            /* 合并旧数据和新数据 */
            .compose(original -> Ux.future(Apt.create(original, recordData)))

            /* 按标识规则对比结果 */
            .compose(apt -> Ux.future(Ao.diffPure(apt, this.atom, Ox.ignorePure(this.atom)).compared()))

            /* 变更表 */
            .compose(map -> {
                /*
                 * 处理不同类型的数据
                 */
                Ox.Log.infoReport(this.getClass(), map);
                final List<Future<JsonArray>> futures = new ArrayList<>();
                /*
                 * 只执行操作类型
                 */
                if (this.types.contains(ChangeFlag.ADD)) {
                    futures.add(this.addRecord(map.get(ChangeFlag.ADD), hex.batch(ChangeFlag.ADD)));
                }
                if (this.types.contains(ChangeFlag.UPDATE)) {
                    futures.add(this.updateRecord(map.get(ChangeFlag.UPDATE), hex.batch(ChangeFlag.UPDATE)));
                }
                if (this.types.contains(ChangeFlag.DELETE)) {
                    futures.add(this.deleteRecord(map.get(ChangeFlag.DELETE), hex.batch(ChangeFlag.DELETE)));
                }
                return Ux.thenCombineArray(futures);
            });
    }

    protected Class<?> completerCls() {
        return CompleterDefault.class;
    }

    // ------------------- 下边全是私有函数 --------------------

    private Future<JsonArray> fetchAsync(final JsonObject criteria) {
        if (Objects.isNull(this.fnFetcher)) {
            if (Ut.isNil(criteria)) {
                return this.dao.fetchAllAsync().compose(Ux::futureA);
            } else {
                return this.dao.fetchAsync(Ut.sureJObject(criteria)).compose(Ux::futureA);
            }
        } else {
            return this.fnFetcher.get();
        }
    }

    private Future<JsonArray> deleteRecord(final JsonArray data, final JsonObject options) {
        return this.processAsync(data, options, (atomy, aspect) -> {
            /* Completer构造 */
            final Completer completer = Completer.create(this.completerCls(), this.dao, this.atom).bind(options);
            final JsonArray original = atomy.dataO();
            return aspect.run(original, processed -> completer.remove(processed)
                /* 变更历史 */
                .compose(nil -> this.io.procAsync(null, original, options, original.size()))
            );
        });
    }

    private Future<JsonArray> updateRecord(final JsonArray data, final JsonObject options) {
        return this.processAsync(data, options, (atomy, aspect) -> {
            /* Completer构造 */
            final Completer completer = Completer.create(this.completerCls(), this.dao, this.atom).bind(options);
            final JsonArray input = atomy.comparedU();
            /* Input / Assert */
            return aspect.run(input, processed -> completer.update(processed)
                /* 变更历史 */
                .compose(updated -> this.io.procAsync(updated, atomy.dataO(), options, updated.size()))
            );
        });
    }

    private Future<JsonArray> addRecord(final JsonArray data, final JsonObject options) {
        return this.processAsync(data, options, (atomy, aspect) -> {
            /* Completer构造 */
            final Completer completer = Completer.create(this.completerCls(), this.dao, this.atom).bind(options);
            JsonArray input = atomy.comparedA();
            /* fnDefault默认值专用函数 */
            if (Objects.nonNull(this.fnDefault)) {
                input = this.fnDefault.apply(input);
            }
            return aspect.run(input, processed -> completer.create(processed)
                /* 变更历史 */
                .compose(created -> this.io.procAsync(created, null, options, created.size()))
            );
        });
    }

    private Future<JsonArray> processAsync(final JsonArray input, final JsonObject options,
                                           final BiFunction<Apt, AspectSwitcher, Future<JsonArray>> consumer) {
        if (input.isEmpty()) {
            return Ux.future(new JsonArray());
        } else {
            final Apt apt = Ux.ruleApt(input, false);
            /* Aspect插件 */
            final AspectSwitcher aspect = new AspectSwitcher(this.atom, options, this.fabric);
            return consumer.apply(apt, aspect);
        }
    }
}