package cn.originx.migration.restore;

import cn.originx.migration.AbstractStep;
import io.horizon.eon.em.Environment;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.tp.ke.booter.Bt;
import io.vertx.up.unity.Ux;

import static cn.originx.refine.Ox.LOG;

public class MetaLoader extends AbstractStep {
    public MetaLoader(final Environment environment) {
        super(environment);
    }

    @Override
    public Future<JsonObject> procAsync(final JsonObject config) {
        this.banner("002.2. 配置升级");
        return Bt.loadAsync("init/oob/").compose(nil -> {
            LOG.Shell.info(this.getClass(), "新配置已经成功导入到系统！Successfully");
            return Ux.future(config);
        });
    }
}
