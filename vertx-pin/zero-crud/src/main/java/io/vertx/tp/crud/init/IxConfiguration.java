package io.vertx.tp.crud.init;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.tp.crud.atom.IxConfig;
import io.vertx.tp.crud.cv.IxFolder;
import io.vertx.up.util.Ut;

import java.text.MessageFormat;
import java.util.HashSet;
import java.util.Set;

import static io.vertx.tp.crud.refine.Ix.LOG;

/*
 * Configuration class initialization
 * plugin/crud/configuration.json
 *
 */
class IxConfiguration {

    /* Module Registry */
    private static final Set<String> MODULE_REG =
        new HashSet<>();
    private static IxConfig CONFIG = null;

    static void init() {
        /*
         * Read definition of security configuration from RBAC default folder
         */
        if (null == CONFIG) {
            final JsonObject configData = Ut.ioJObject(IxFolder.CONFIG_FILE);
            LOG.Init.info(IxConfiguration.class, "Ix Json Data: {0}", configData.encode());
            CONFIG = Ut.deserialize(configData, IxConfig.class);
            LOG.Init.info(IxConfiguration.class, "Ix Configuration: {0}", CONFIG.toString());
        }
    }

    static void addUrs(final String key) {
        final JsonArray patterns = CONFIG.getPatterns();
        patterns.stream()
            .map(item -> (String) item)
            .map(pattern -> MessageFormat.format(pattern, key))
            .forEach(MODULE_REG::add);
    }

    static Set<String> getUris() {
        return MODULE_REG;
    }

    static String getField() {
        return CONFIG.getColumnKeyField();
    }

    static String getLabel() {
        return CONFIG.getColumnLabelField();
    }
}
