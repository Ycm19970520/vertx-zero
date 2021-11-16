package cn.zeroup.macrocosm.service;

import cn.vertxup.workflow.domain.tables.daos.WFlowDao;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.tp.ke.refine.Ke;
import io.vertx.tp.optic.DForm;
import io.vertx.tp.workflow.refine.Wf;
import io.vertx.tp.workflow.uca.runner.StoreOn;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class FlowService implements FlowStub {
    @Override
    public Future<JsonObject> fetchFlow(final String code, final String sigma) {
        // 1. Fetch workflow definition from Camunda
        final StoreOn storeOn = StoreOn.get();
        return storeOn.processByKey(code).compose(definition -> {
            // Fetch X_FLOW
            final JsonObject condition = Ux.whereAnd();
            condition.put(KName.CODE, code);
            condition.put(KName.SIGMA, sigma);
            return Ux.Jooq.on(WFlowDao.class).fetchJOneAsync(condition).compose(workflow -> {
                // Combine result
                final JsonObject response = new JsonObject();
                response.mergeIn(workflow);
                response.mergeIn(definition);
                return Ux.future(response);
            });
        });
    }

    @Override
    public Future<JsonObject> fetchFormStart(final String definitionId, final String sigma) {
        final StoreOn storeOn = StoreOn.get();
        return storeOn.formById(definitionId, false)
            .compose(formData -> this.fetchFormInternal(formData, sigma))
            .compose(response -> storeOn.processById(definitionId)
                .compose(Ux.attachJ(KName.Flow.WORKFLOW, response))
            );
    }

    @Override
    public Future<JsonObject> fetchFormTask(final String instanceId, final String sigma) {
        final StoreOn storeOn = StoreOn.get();
        return storeOn.formById(instanceId, true)
            .compose(formData -> this.fetchFormInternal(formData, sigma))
            .compose(response -> storeOn.processByTask(instanceId)
                .compose(Ux.attachJ(KName.Flow.WORKFLOW, response))
            );
    }

    private Future<JsonObject> fetchFormInternal(final JsonObject formData, final String sigma) {
        final JsonObject response = new JsonObject();
        final JsonObject parameters = Wf.formInput(formData, sigma);
        return Ke.channel(DForm.class, JsonObject::new, stub -> stub.fetchUi(parameters))
            .compose(Ux.attachJ(KName.FORM, response));
    }
}
