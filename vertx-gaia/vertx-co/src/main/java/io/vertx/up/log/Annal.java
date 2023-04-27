package io.vertx.up.log;

import io.horizon.log.HLogger;
import io.horizon.uca.cache.Cc;
import io.vertx.up.log.internal.BridgeAnnal;
import io.vertx.up.log.internal.Log4JAnnal;

import java.util.Objects;

/**
 * Unite Logging system connect to vert.x, io.vertx.zero.io.vertx.zero.io.vertx.up.io.vertx.up.io.vertx.up.util kit of Vertx-Zero
 */
public interface Annal extends HLogger {

    Cc<Class<?>, Annal> CC_ANNAL = Cc.open();
    Cc<Integer, Annal> CC_ANNAL_INTERNAL = Cc.open();

    static Annal get(final Class<?> clazz) {
        final Class<?> cacheKey = Objects.isNull(clazz) ? Log4JAnnal.class : clazz;
        return CC_ANNAL.pick(() -> new BridgeAnnal(clazz), cacheKey);
    }
}
