package io.vertx.up.secure.bridge;

import io.vertx.core.Vertx;
import io.vertx.ext.auth.authentication.AuthenticationProvider;
import io.vertx.ext.web.handler.AuthenticationHandler;
import io.vertx.ext.web.handler.AuthorizationHandler;
import io.vertx.tp.error.WallItemSizeException;
import io.vertx.tp.error.WallProviderConflictException;
import io.vertx.up.atom.secure.Aegis;
import io.vertx.up.atom.secure.AegisItem;
import io.vertx.up.eon.em.AuthWall;
import io.vertx.up.fn.Fn;
import io.vertx.up.log.Annal;
import io.vertx.up.secure.Lee;
import io.vertx.up.secure.LeeBuiltIn;
import io.vertx.up.secure.LeeExtension;
import io.vertx.up.util.Ut;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
class BoltWhich implements Bolt {
    private static final Annal LOGGER = Annal.get(BoltWhich.class);
    // LOGGER Control
    private static final AtomicBoolean[] LOG_LEE = new AtomicBoolean[]{
        new AtomicBoolean(Boolean.TRUE),
        new AtomicBoolean(Boolean.TRUE),
        new AtomicBoolean(Boolean.TRUE)
    };
    private static final ConcurrentMap<String, Lee> POOL_LEE = new ConcurrentHashMap<>();
    static ConcurrentMap<String, Bolt> POOL_BOLT = new ConcurrentHashMap<>();

    @Override
    public AuthenticationHandler authenticate(final Vertx vertx, final Aegis config) {
        Objects.requireNonNull(config);
        if (config.noAuthentication()) {
            // Log
            if (LOG_LEE[0].getAndSet(Boolean.FALSE)) {
                LOGGER.warn(Info.AUTH_401_METHOD, config);
            }
            return null;
        }
        final Aegis verified = this.verifyAuthenticate(config);
        final Lee lee = this.reference(config);
        if (Objects.isNull(lee)) {
            // Log
            if (LOG_LEE[1].getAndSet(Boolean.FALSE)) {
                LOGGER.warn(Info.AUTH_401_SERVICE, config.getType());
            }
            return null;
        }
        final AuthenticationHandler handler = lee.authenticate(vertx, verified);
        if (Objects.isNull(handler)) {
            // Log
            if (LOG_LEE[2].getAndSet(Boolean.FALSE)) {
                LOGGER.warn(Info.AUTH_401_HANDLER, config.getType());
            }
        }
        return handler;
    }

    @Override
    public AuthorizationHandler authorization(final Vertx vertx, final Aegis config) {
        Objects.requireNonNull(config);
        if (config.noAuthorization()) {
            return null;
        }
        final Lee lee = this.reference(config);
        if (Objects.isNull(lee)) {
            return null;
        }
        return lee.authorization(vertx, config);
    }

    /*
     * Here the validation rules
     * 1. The size of provider should be matched
     * - Extension could be > 1
     * - Others must be = 1
     * 2. All the following must be match
     * - JWT, WEB, OAUTH2, DIGEST
     * They are fixed provider of authenticate
     */
    private Aegis verifyAuthenticate(final Aegis config) {
        if (AuthWall.EXTENSION != config.getType()) {
            /*
             * The size should be 1 ( For non-extension )
             */
            final AegisItem item = config.item();
            Fn.outUp(Objects.isNull(item), WallItemSizeException.class,
                this.getClass(), config.getType(), 1);
        }
        final Set<Class<?>> provider = config.providers();
        /*
         * Must be valid type of provider
         */
        provider.forEach(item -> Fn.outUp(!AuthenticationProvider.class.isAssignableFrom(item),
            WallProviderConflictException.class,
            this.getClass(), item));
        return config;
    }

    private Lee reference(final Aegis config) {
        final AuthWall wall = config.getType();
        if (AuthWall.EXTENSION == wall) {
            return Fn.poolThread(POOL_LEE, () -> Ut.service(LeeExtension.class), LeeExtension.class.getName());
        } else {
            return Fn.poolThread(POOL_LEE, () -> Ut.service(LeeBuiltIn.class), LeeBuiltIn.class.getName());
        }
    }
}