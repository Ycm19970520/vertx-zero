package io.vertx.up.uca.cache;

import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class CdMem<K, V> implements Cd<K, V> {
    private final transient ConcurrentMap<K, V> dataMap = new ConcurrentHashMap<>();

    @Override
    public void data(final K key, final V value) {
        this.dataMap.put(key, value);
    }

    @Override
    public V data(final K key) {
        return this.dataMap.get(key);
    }

    @Override
    @SuppressWarnings("unchecked")
    public ConcurrentMap<K, V> data() {
        return this.dataMap;
    }

    @Override
    public void clear() {
        this.dataMap.clear();
    }

    @Override
    public boolean is(final K key) {
        if (Objects.isNull(key)) {
            return false;
        }
        return this.dataMap.containsKey(key);
    }
}
