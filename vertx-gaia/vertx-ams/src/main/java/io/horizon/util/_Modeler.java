package io.horizon.util;

import io.modello.specification.HRecord;
import io.vertx.core.json.JsonArray;

/**
 * @author lang : 2023/4/28
 */
class _Modeler extends _It {
    protected _Modeler() {
    }

    /**
     * 建模专用转换，将记录转换成JsonObject
     *
     * @param records 记录
     *
     * @return JsonObject
     */
    public static JsonArray toJArray(final HRecord[] records) {
        return HJson.toJArray(records);
    }
}
