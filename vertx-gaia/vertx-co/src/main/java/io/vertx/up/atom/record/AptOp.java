package io.vertx.up.atom.record;

import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.em.ChangeFlag;

import java.util.concurrent.ConcurrentMap;

/*
 * Package scope
 */
interface AptOp<T> {
    /* Original data here */
    T dataO();

    /* Current data here */
    T dataN();

    T dataN(T dataArray);

    /*
     * Current data ( Maybe update )
     */
    T data();

    /*
     * Return current type of Change
     */
    ChangeFlag type();

    /*
     * Update data based on `current`.
     */
    AptOp<T> update(JsonObject data);

    /*
     * Get compared data here
     */
    ConcurrentMap<ChangeFlag, T> compared();

    /*
     * Get T by `ChangeFlag`
     */
    default T compared(final ChangeFlag flag) {
        return this.compared().get(flag);
    }

    /*
     * Write compared map data here
     */
    default AptOp<T> compared(final ConcurrentMap<ChangeFlag, T> input) {
        final ConcurrentMap<ChangeFlag, T> map = this.compared();
        map.clear();
        map.putAll(input);
        return this;
    }
}
