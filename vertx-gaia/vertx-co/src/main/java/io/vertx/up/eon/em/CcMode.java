package io.vertx.up.eon.em;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public enum CcMode {
    CONFIGURATION, // <K, JsonObject>
    THREAD,        // <String, V>
    STANDARD,      // <K, V>
}
