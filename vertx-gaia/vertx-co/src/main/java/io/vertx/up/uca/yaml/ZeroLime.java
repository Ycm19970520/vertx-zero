package io.vertx.up.uca.yaml;

import io.reactivex.Observable;
import io.vertx.core.json.JsonObject;
import io.vertx.up.eon.KName;
import io.vertx.up.eon.Strings;
import io.vertx.up.fn.Fn;
import io.vertx.up.log.Annal;
import io.vertx.up.uca.cache.CcOld;
import io.vertx.up.util.Ut;

import java.util.Set;
import java.util.concurrent.ConcurrentMap;

/**
 * @author lang
 */
public class ZeroLime implements Node<ConcurrentMap<String, String>> {

    private static final Annal LOGGER = Annal.get(ZeroLime.class);

    private static final CcOld<String, String> CC_INTERNAL = CcOld.open();

    static {
        final ConcurrentMap<String, String> dataRef = CC_INTERNAL.pick();
        dataRef.put(KName.Internal.ERROR, ZeroTool.produce(KName.Internal.ERROR));
        dataRef.put(KName.Internal.INJECT, ZeroTool.produce(KName.Internal.INJECT));
        dataRef.put(KName.Internal.SERVER, ZeroTool.produce(KName.Internal.SERVER));
        dataRef.put(KName.Internal.RESOLVER, ZeroTool.produce(KName.Internal.RESOLVER));
    }

    private transient final Node<JsonObject> node
        = Ut.singleton(ZeroVertx.class);

    @Override
    public ConcurrentMap<String, String> read() {
        // 1. Read all zero configuration: zero
        final JsonObject data = this.node.read();
        // 2. Read the string node "lime" for extensions
        return this.build(data.getString(KName.Internal.LIME));
    }

    private ConcurrentMap<String, String> build(final String literal) {
        final Set<String> sets = Ut.toSet(literal, Strings.COMMA);
        LOGGER.debug("Lime node parsing \"{0}\" and size is = {1}", literal, sets.size());
        Fn.safeNull(() -> Observable.fromIterable(sets)
            .subscribe(item -> CC_INTERNAL.pick(item, () -> ZeroTool.produce(item))
                // Fn.po?l(INTERNALS, item, () -> ZeroTool.produce(item))\
            ).dispose(), literal);
        return CC_INTERNAL.pick();
    }
}
