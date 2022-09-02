package io.vertx.aeon.atom.secure;

import io.vertx.aeon.eon.em.ScDim;
import io.vertx.aeon.eon.em.ScIn;
import io.vertx.aeon.runtime.H1H;
import io.vertx.aeon.runtime.H3H;
import io.vertx.aeon.specification.secure.HAdmit;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.KName;
import io.vertx.up.eon.Strings;
import io.vertx.up.eon.em.run.ActPhase;
import io.vertx.up.util.Ut;

import java.io.Serializable;
import java.util.Objects;

/*
 * 新数据结构，为迎合多种模式量身打造，构造
 * DM / UI 时统一参数用
 * Catena: 连锁（事件），彼此连接的一串内容
 * 和 HPermit 不同点在于，HCatena 只保存处理过程中的数据，不保存配置，所以此处
 * - request：代表输入
 * - configDm / dataDm：代表DM处理前和后的结果
 * - configUi / dataUi：代表UI处理前和后的结果
 */
public class HCatena implements Serializable {
    private final JsonObject request = new JsonObject();
    private final JsonObject configDm = new JsonObject();           // 执行过 configure 后的结果
    private final JsonObject dataDm = new JsonObject();             // 最终 compile 后的结果
    private final JsonObject configUi = new JsonObject();           // 执行过 configure 后的结果
    private final JsonObject dataUi = new JsonObject();             // 最终 compile 后的结果

    private HCatena(final JsonObject request) {
        this.request.mergeIn(request, true);
    }

    public static HCatena instance(final JsonObject request) {
        final JsonObject requestJ = Ut.valueJObject(request);
        return new HCatena(requestJ);
    }

    public static HPermit permit(final JsonObject input) {
        final String sigma = Ut.valueString(input, KName.SIGMA);
        final String code = Ut.valueString(input, KName.CODE);
        // 绑定基础信息：code, sigma, name
        final HPermit permit = HPermit.create(code, sigma, Ut.valueString(input, KName.NAME));


        // 维度信息绑定
        final ScDim dmType = Ut.toEnum(() -> Ut.valueString(input, KName.DM_TYPE), ScDim.class, ScDim.NONE);
        permit.shape(dmType).shape(Ut.valueJObject(input, KName.MAPPING)).shape(
            Ut.valueJObject(input, KName.DM_CONDITION),
            Ut.valueJObject(input, KName.DM_CONFIG)
        );


        // 呈现信息绑定
        final ScIn uiType = Ut.toEnum(
            () -> Ut.valueString(input, KName.UI_TYPE), ScIn.class, ScIn.NONE);
        final ActPhase uiPhase = Ut.toEnum(
            () -> Ut.valueString(input, KName.PHASE), ActPhase.class, ActPhase.ERROR);

        permit.ui(uiType, uiPhase).ui(Ut.valueJObject(input, KName.UI_SURFACE)).ui(
            Ut.valueJObject(input, KName.UI_CONDITION),
            Ut.valueJObject(input, KName.UI_CONFIG)
        );

        // 子节点处理
        final JsonArray childrenJ = Ut.valueJArray(input, KName.CHILDREN);
        Ut.itJArray(childrenJ).map(HCatena::permit).forEach(permit::child);
        return permit;
    }

    // ----------- 组件引用提取 -----------
    /* isDM = true
     * {
     *     "dmComponent": "HDm Interface",
     *     "sigma": "xxx"
     * }
     * isDM = false
     * {
     *     "uiComponent": "HUi interface"
     *     "sigma": "xxx"
     * }
     */
    public HAdmit admit(final boolean isDM) {
        final String sigma = Ut.valueString(this.request, KName.SIGMA);
        final Class<?> admitCls;
        if (isDM) {
            admitCls = Ut.valueCI(this.request, KName.Component.DM_COMPONENT, HAdmit.class);
        } else {
            admitCls = Ut.valueCI(this.request, KName.Component.UI_COMPONENT, HAdmit.class);
        }
        if (Objects.isNull(admitCls)) {
            //  Ui / Dm to avoid null pointer
            return null;
        }

        final HAdmit dm = (HAdmit) H1H.CCT_EVENT.pick(() -> Ut.instance(admitCls),
            // <sigma> / <name>
            sigma + Strings.SLASH + admitCls.getName());
        return dm.bind(sigma);
    }

    public HPermit permit() {
        final JsonObject requestJ = Ut.valueJObject(this.request);
        // Build Cache Key Based on `sigma / code`
        final String sigma = Ut.valueString(requestJ, KName.SIGMA);
        final String code = Ut.valueString(requestJ, KName.CODE);
        Ut.notNull(sigma, code);
        // Store KApp information
        return H3H.CC_PERMIT.pick(() -> permit(requestJ), sigma + Strings.SLASH + code);
    }

    // ----------- 单独取数 -----------

    public JsonObject data(final boolean isDM) {
        return isDM ? this.dataDm : this.dataUi;
    }

    public JsonObject config(final boolean isDM) {
        return isDM ? this.configDm : this.configUi;
    }

    public Future<HCatena> data(final JsonObject data, final boolean isDM) {
        final JsonObject dataJ = Ut.valueJObject(data);
        if (isDM) {
            this.dataDm.mergeIn(dataJ, true);
        } else {
            this.dataUi.mergeIn(dataJ, true);
        }
        return Future.succeededFuture(this);
    }

    public Future<HCatena> config(final JsonObject config, final boolean isDM) {
        final JsonObject configJ = Ut.valueJObject(config);
        if (isDM) {
            this.configDm.mergeIn(configJ, true);
        } else {
            this.configUi.mergeIn(configJ, true);
        }
        return Future.succeededFuture(this);
    }

    // ----------- 流程取数 -----------
    public JsonObject request() {
        return this.request.copy();
    }

    /*
     * 构造 UI 编译数据
     * {
     *     "dm" -> dataDm
     *     "ui" -> configUi
     *     "in" -> request
     * }
     */
    public JsonObject medium() {
        final JsonObject parameters = new JsonObject();
        parameters.put(KName.Rbac.DM, this.dataDm);
        parameters.put(KName.Rbac.UI, this.configUi);
        parameters.put(KName.IN, this.request);
        return parameters;
    }
}