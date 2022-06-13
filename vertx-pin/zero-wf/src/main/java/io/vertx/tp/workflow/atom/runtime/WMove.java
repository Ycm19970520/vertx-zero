package io.vertx.tp.workflow.atom.runtime;

import cn.zeroup.macrocosm.cv.em.NodeType;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.tp.workflow.refine.Wf;
import io.vertx.up.eon.KName;
import io.vertx.up.eon.Strings;
import io.vertx.up.uca.sectio.AspectConfig;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class WMove implements Serializable {
    private final ConcurrentMap<String, WRule> rules = new ConcurrentHashMap<>();
    /*
     * The data structure is as following:
     * {
     *     "node": {
     *         "type": "Standard | Fork | Multi"
     *         "data": {
     *         },
     *         "rule": [
     *             WRule,
     *             WRule
     *         ],
     *         "aspect": AspectConfig,
     *         "gateway": {
     *              "taskKey": "path of value"
     *         }
     *     }
     * }
     *
     * 1) When `Standard` Mode, the `fork` configuration will not be used.
     * 2) When `Multi` Mode, the `fork` configuration will not be used.
     * 3) 「Valid」When `Fork/Join` Mode, the `fork` configuration will help to create Todo Tickets
     */
    private final String node;

    private final NodeType type;
    private final ConcurrentMap<String, String> data = new ConcurrentHashMap<>();
    private final AspectConfig aspect;

    private final ConcurrentMap<String, String> gateway = new ConcurrentHashMap<>();

    private WMove(final String node, final JsonObject config) {
        // Node Name
        this.node = node;
        // Config for Camunda Engine
        final JsonObject data = Ut.valueJObject(config.getJsonObject(KName.DATA));
        Ut.<String>itJObject(data, (value, field) -> this.data.put(field, value));

        // Processing for left rules
        final JsonArray rules = Ut.valueJArray(config.getJsonArray(KName.RULE));
        Ut.itJArray(rules).forEach(json -> {
            final WRule rule = Ux.fromJson(json, WRule.class);
            if (rule.valid()) {
                this.rules.put(rule.key(), rule);
            } else {
                Wf.Log.warnMove(this.getClass(), "Rule invalid: {0}", rule.toString());
            }
        });

        // Processing for Aspect
        this.aspect = AspectConfig.create(Ut.valueJObject(config, KName.ASPECT));

        /*
         * Processing for NodeType configuration
         * 1. type = Standard
         * 2. type = Fork
         * 3. type = Multi
         *
         * The configuration node should be gateway, in current version, this
         * configuration is Ok for `Fork` only.
         */
        this.type = Ut.toEnum(() -> config.getString(KName.TYPE), NodeType.class, NodeType.Standard);
        final JsonObject gatewayJ = Ut.valueJObject(config, KName.GATEWAY);
        Ut.<String>itJObject(gatewayJ, (to, from) -> this.gateway.put(from, to));
    }

    public static WMove create(final String node, final JsonObject config) {
        return new WMove(node, config);
    }

    public static WMove empty() {
        return new WMove(null, new JsonObject());
    }

    AspectConfig configAop() {
        return this.aspect;
    }

    /*
     * parameters for two components
     * 1. Movement Internal call `RunOn`, based on WRequest request
     * 2. Transfer will select `WRule` for process execution
     */
    JsonObject inputMovement(final JsonObject requestJ) {
        // Extract Data from `data` configuration
        final JsonObject arguments = new JsonObject();
        this.data.forEach((to, from) -> arguments.put(to, requestJ.getValue(from)));
        return arguments;
    }

    WRule inputTransfer(final JsonObject params) {
        final Set<String> keys = new TreeSet<>();
        params.fieldNames().forEach(field -> {
            final Object value = params.getValue(field);
            if (Objects.nonNull(value)) {
                final String key = field + Strings.EQUAL + value;
                keys.add(key);
            }
        });
        final String key = Ut.fromJoin(keys);
        final WRule rule = this.rules.getOrDefault(key, null);
        Wf.Log.infoMove(this.getClass(), "[ Rule ] The node `{0}` rule processed: {1}", this.node, rule);
        return rule;
    }
}