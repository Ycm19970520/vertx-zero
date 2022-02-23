package io.vertx.tp.workflow.uca.component;

import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public abstract class AbstractRecord implements Register {

    /*
     * {
     *     "record": "...",
     * }
     * - record: The json data of record
     * - The json data of todo is the major key=value
     */
    protected JsonObject normalize(final JsonObject params, final JsonObject rData, final boolean isNew) {
        // Auditor Processing
        if (isNew) {
            if (params.containsKey(KName.CREATED_AT)) {
                Ut.ifJAssign(params,
                    KName.CREATED_AT,
                    KName.CREATED_BY
                ).apply(rData);
            } else {
                rData.put(KName.CREATED_BY, params.getValue(KName.UPDATED_BY));
                rData.put(KName.CREATED_AT, params.getValue(KName.UPDATED_AT));
            }
        }
        Ut.ifJAssign(params,
            KName.UPDATED_AT,
            KName.UPDATED_BY,
            KName.SIGMA,
            KName.LANGUAGE
        ).apply(rData);
        // Zero Specification
        if (!rData.containsKey(KName.ACTIVE)) {
            rData.put(KName.ACTIVE, Boolean.TRUE);
        }
        return rData;
    }

    protected Future<JsonObject> outputAsync(final JsonObject params, final JsonArray record) {
        // Callback Operation On Record
        return Ux.future(params.put(KName.RECORD, record));
    }

    protected Future<JsonObject> outputAsync(final JsonObject params, final JsonObject record) {
        // Callback Operation On Record
        if (Ut.notNil(record)) {
            params.put(KName.RECORD, record);
        }
        return Ux.future(params);
    }
}