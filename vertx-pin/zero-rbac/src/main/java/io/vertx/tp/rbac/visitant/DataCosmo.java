package io.vertx.tp.rbac.visitant;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.up.commune.Envelop;

/**
 * @author <a href="http://www.origin-x.cn">lang</a>
 * For Data Region enhancement module for `visitant` extension
 */
public interface DataCosmo {
    /*
     * When before happened on data region
     * The cosmo should process on Envelop
     */
    Future<Envelop> before(Envelop request, JsonObject matrix);

    /*
     * When after happened on data region
     * The cosmo should process on Envelop based on visitant
     */
    Future<Envelop> after(Envelop response, JsonObject matrix);
}
