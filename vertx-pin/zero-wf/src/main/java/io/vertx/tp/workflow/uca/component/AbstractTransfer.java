package io.vertx.tp.workflow.uca.component;

import io.vertx.core.json.JsonObject;
import io.vertx.tp.workflow.atom.ConfigRecord;
import io.vertx.tp.workflow.atom.WMove;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public abstract class AbstractTransfer implements Behaviour {
    protected final transient JsonObject config = new JsonObject();
    private final transient ConcurrentMap<String, WMove> moveMap = new ConcurrentHashMap<>();
    private transient ConfigRecord record;

    @Override
    public Behaviour bind(final JsonObject config) {
        final JsonObject sure = Ut.sureJObject(config);
        this.config.mergeIn(sure.copy(), true);
        if (sure.containsKey(KName.RECORD)) {
            this.record = Ux.fromJson(sure.getJsonObject(KName.RECORD), ConfigRecord.class);
        }
        if (sure.containsKey(KName.Flow.NODE)) {
            final JsonObject configData = sure.getJsonObject(KName.Flow.NODE);
            Ut.<JsonObject>itJObject(configData, (value, field) -> {
                final WMove item = Ux.fromJson(value, WMove.class);
                item.setNode(field);
                this.moveMap.put(field, item);
            });
        }
        return this;
    }

    protected WMove configN(final String node) {
        return this.moveMap.get(node);
    }

    protected ConfigRecord configR() {
        return this.record;
    }

    /*
     * {
     *     "record": "...",
     * }
     * - record: The json data of record
     * - The json data of todo is the major key=value
     */
    protected JsonObject requestR(final JsonObject params) {
        JsonObject rData = params.getJsonObject(KName.RECORD, new JsonObject());
        if (Ut.notNil(rData)) {
            rData = rData.copy();
        }
        return rData;
    }

    protected JsonObject requestM(final JsonObject params, final WMove move) {
        final ConcurrentMap<String, String> pattern = move.getData();
        final JsonObject request = new JsonObject();
        pattern.forEach((to, from) -> request.put(to, params.getValue(from)));
        return request;
    }
}
