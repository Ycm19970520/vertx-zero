package cn.vertxup.battery.service;

import cn.vertxup.battery.domain.tables.daos.BBlockDao;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.tp.battery.cv.BkCv;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

import java.util.Set;
import java.util.concurrent.ConcurrentMap;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class BlockService implements BlockStub {
    @Override
    public Future<ConcurrentMap<String, JsonArray>> fetchByApp(final String appId) {
        final JsonObject condition = Ux.whereAnd(KName.APP_ID, appId);
        return this.fetchBlock(condition)
            // bagId = JsonArray
            .compose(blockArray -> Ux.future(Ut.elementGroup(blockArray, KName.App.BAG_ID)));
    }

    @Override
    public Future<JsonArray> fetchByBag(final String bagId) {
        final JsonObject condition = Ux.whereAnd(KName.App.BAG_ID, bagId);
        return this.fetchBlock(condition);
    }

    @Override
    public Future<ConcurrentMap<String, JsonArray>> fetchByBag(final Set<String> bagIds) {
        final JsonObject condition = Ux.whereAnd();
        condition.put(KName.App.BAG_ID + ",i", Ut.toJArray(bagIds));
        return this.fetchBlock(condition)
            // bagId = JsonArray
            .compose(blockArray -> Ux.future(Ut.elementGroup(blockArray, KName.App.BAG_ID)));
    }

    private Future<JsonArray> fetchBlock(final JsonObject condition) {
        // Block Processing
        return Ux.Jooq.on(BBlockDao.class).fetchJAsync(condition).compose(Ut.ifJArray(
            KName.Flow.UI_STYLE,
            KName.Flow.UI_CONFIG,
            BkCv.License.LIC_IDENTIFIER,
            BkCv.License.LIC_MENU
        ));
    }
}
