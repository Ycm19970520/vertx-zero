package io.vertx.tp.crud.uca.desk;

import io.vertx.core.Future;
import io.vertx.tp.crud.init.IxPin;
import io.vertx.tp.error._404ModuleMissingException;
import io.vertx.tp.ke.atom.KModule;
import io.vertx.tp.ke.atom.connect.KJoin;
import io.vertx.tp.ke.atom.connect.KPoint;
import io.vertx.tp.ke.cv.em.JoinMode;
import io.vertx.up.commune.Envelop;
import io.vertx.up.exception.WebException;
import io.vertx.up.fn.Fn;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

import java.util.Objects;
import java.util.function.BiFunction;

/**
 * Wrap `envelop` here as request params
 *
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class IxIn {
    private final transient Envelop envelop;
    private transient KModule module;
    private transient WebException error;

    private IxIn(final Envelop envelop, final String identifier) {
        this.envelop = envelop;
        /* 1. Actor value here from `Envelop` */
        final String actor = Ux.getString(envelop);
        KModule module;
        try {
            /* 2. IxModule extracting by `actor` */
            module = IxPin.getActor(actor);
            Fn.out(Objects.isNull(module), _404ModuleMissingException.class, this.getClass(), actor);
            /*
             * 3. Joined module processing for standBy
             *    Here are switcher for IxIn to create request
             *    When you passed identifier it means that here are query string as following:
             *
             * /xxxx?module=
             *
             * The `identifier` of `actor` is different from `module`
             *
             * Example:
             *
             * /x-category/xxxx?module=pay-term
             * */
            if (Ut.isNil(identifier)) {
                // Active
                this.module = module;
            } else {
                // StandBy
                /*
                 * Connect processing, here are `module.isDirect` means
                 * KJoin must not be null
                 */
                final KJoin connect = module.getConnect();
                Fn.out(Objects.isNull(connect), _404ModuleMissingException.class, this.getClass(), actor);
                final KPoint target = connect.procTarget(identifier);
                if (Objects.nonNull(target) && JoinMode.CRUD == target.modeTarget()) {
                    assert Objects.nonNull(target.getCrud());
                    module = IxPin.getActor(target.getCrud());
                    Fn.out(Objects.isNull(module), _404ModuleMissingException.class, this.getClass(), target.getCrud());
                    this.module = module;
                }
            }
        } catch (final WebException error) {
            // TODO: Exception here.
            error.printStackTrace();
            this.error = error;
        }
    }

    public static IxIn active(final Envelop envelop) {
        return new IxIn(envelop, null);
    }

    public static IxIn standBy(final Envelop envelop, final String identifier) {
        return new IxIn(envelop, identifier);
    }

    public Envelop envelop() {
        return this.envelop;
    }

    public KModule module() {
        return this.module;
    }

    @SafeVarargs
    public final <T> Future<T> ready(
            final T input,
            final BiFunction<T, IxIn, Future<T>>... executors) {
        // Error Checking for request building
        if (Objects.nonNull(this.error)) {
            return Future.failedFuture(this.error);
        }

        // Sequence for future management
        Future<T> future = Future.succeededFuture(input);
        for (final BiFunction<T, IxIn, Future<T>> executor : executors) {
            if (Objects.nonNull(executor)) {
                future = future.compose(data -> executor.apply(data, this));
            }
        }
        return future;
    }
}
