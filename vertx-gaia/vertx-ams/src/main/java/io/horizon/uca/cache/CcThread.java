package io.horizon.uca.cache;

import io.horizon.util.HUt;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Supplier;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
class CcThread<V> implements Cc<String, V> {
    private final transient ConcurrentMap<String, V> store = new ConcurrentHashMap<>();

    @Override
    public ConcurrentMap<String, V> store() {
        return this.store;
    }

    @Override
    public boolean isEmpty() {
        return this.store.isEmpty();
    }

    @Override
    public V pick(final Supplier<V> supplier) {
        //        final ConcurrentMap<String, V> pool = this.store.data();
        return HUt.poolThread(this.store, supplier);
    }

    @Override
    public V pick(final Supplier<V> supplier, final String key) {
        //        final ConcurrentMap<String, V> pool = this.store.data();
        return HUt.poolThread(this.store, supplier, key);
    }

    @Override
    public V store(final String key) {
        return this.store.getOrDefault(key, null);
    }
}
