package io.vertx.tp.plugin.cache;

import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.up.log.Annal;
import io.vertx.up.uca.yaml.Node;
import io.vertx.up.uca.yaml.ZeroUniform;
import io.vertx.up.util.Ut;

/**
 * @author <a href="http://www.origin-x.cn">lang</a>
 * Life Cycle for cache when processing in
 */
public class Harp {
    private static final Annal LOGGER = Annal.get(Harp.class);
    private static final String KEY_CACHE = "cache";

    private static HarpBus BUS_HARP;

    /*
     * First method for initialized and read configuration
     */
    public static void init(final Vertx vertx) {
        final Node<JsonObject> node = Ut.instance(ZeroUniform.class);
        final JsonObject options = node.read();
        if (options.containsKey(KEY_CACHE)) {
            /*
             * Cache enabled
             */
            final JsonObject config = options.getJsonObject(KEY_CACHE);
            LOGGER.info("( Cache ) L1,L2,L3 has been configured: {0}", config);
            BUS_HARP = HarpBus.create(vertx, config);
            /*
             * Call bus start method for subscribe
             */
        }
    }
}
