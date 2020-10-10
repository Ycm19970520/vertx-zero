package io.vertx.tp.plugin.cache.hit;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.up.util.Ut;

import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author <a href="http://www.origin-x.cn">lang</a>
 */
abstract class AbstractL1Algorithm implements L1Algorithm {
    protected static final String KEY_DATA = "DATA";
    protected static final String KEY_DATA_REF = "DATA_REF";

    @Override
    public String dataUnique(final String type, final JsonObject condition) {
        final TreeMap<String, String> treeMap = this.dataMap(condition);
        return this.dataUnique(type, KEY_DATA_REF, treeMap);
    }

    @Override
    public String dataUnique(final String type, final TreeMap<String, String> treeMap) {
        return this.dataUnique(type, KEY_DATA, treeMap);
    }

    @Override
    public ConcurrentMap<String, Object> dataCache(final JsonObject jsonBody) {
        final ConcurrentMap<String, Object> resultMap = new ConcurrentHashMap<>();
        /*
         * Get refer attribute to check whether contains `reference`
         */
        final Boolean isRefer = jsonBody.getBoolean("refer", Boolean.FALSE);
        /*
         * Data processing for different data part
         * 1) JsonObject - Single Record
         * 2) JsonArray - Collection Data
         */
        this.dataProcess(resultMap, jsonBody, isRefer);
        /*
         * Data refer processing
         */
        if (isRefer) {
            /*
             * Call refer here
             * cacheKey = dataKey here
             */
            this.dataRefer(resultMap, jsonBody);
        }
        return resultMap;
    }

    @Override
    public ConcurrentMap<String, Object> dataKey(final JsonObject jsonBody) {
        final ConcurrentMap<String, Object> resultMap = new ConcurrentHashMap<>();
        /*
         * Get refer attribute to check whether need `dataKey` step
         * refer = true will trigger this method
         */
        final Boolean isRefer = jsonBody.getBoolean("refer", Boolean.FALSE);
        if (isRefer) {
            /*
             * Data Tree processing
             */
            this.dataTree(resultMap, jsonBody);
        }
        return resultMap;
    }

    /*
     * The same for original calculation
     * on element of map ( key = value )
     */
    protected String dataUnique(final String type, final String prefix, final TreeMap<String, String> dataMap) {
        final StringBuilder key = new StringBuilder();
        /*
         * Group Redis by : character here
         */
        key.append(type).append(":").append(this.dataType()).append(":").append(prefix).append(":");
        dataMap.forEach((k, v) -> key.append(k).append("=").append(v).append(","));
        return key.toString();
    }

    /*
     * Convert to TreeMap here
     */
    protected TreeMap<String, String> dataMap(final JsonObject condition) {
        final TreeMap<String, String> treeMap = new TreeMap<>();
        condition.fieldNames().forEach(field -> {
            final Object value = condition.getValue(field);
            if (Objects.nonNull(value)) {
                treeMap.put(field, value.toString());
            }
        });
        return treeMap;
    }


    protected TreeMap<String, String> dataMap(final JsonObject record, final JsonArray key) {
        final TreeSet<String> primaryKey = new TreeSet<>(Ut.toSet(key));
        final TreeMap<String, String> treeMap = new TreeMap<>();
        primaryKey.forEach(field -> {
            final Object value = record.getValue(field);
            if (Objects.nonNull(value)) {
                treeMap.put(field, value.toString());
            }
        });
        return treeMap;
    }


    /*
     * Abstract Processing data
     */
    public abstract String dataType();

    /*
     * Abstract Processing data body
     */
    public abstract void dataProcess(ConcurrentMap<String, Object> resultMap, JsonObject jsonBody, boolean isRefer);

    public abstract void dataRefer(ConcurrentMap<String, Object> resultMap, JsonObject jsonBody);

    public abstract void dataTree(ConcurrentMap<String, Object> resultMap, JsonObject jsonBody);
}
