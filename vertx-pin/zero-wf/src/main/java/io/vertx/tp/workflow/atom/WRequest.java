package io.vertx.tp.workflow.atom;

import io.vertx.codegen.annotations.Fluent;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.up.experiment.specification.KFlow;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

import java.io.Serializable;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class WRequest implements Serializable {
    private final transient JsonObject request = new JsonObject();

    private final transient KFlow flow;

    private transient WRecord record;

    public WRequest(final JsonObject params) {
        final JsonObject request = Ut.valueJObject(params);
        this.request.mergeIn(request, true);
        this.flow = KFlow.build(request);
    }

    // =================== Extract Data =======================

    public JsonObject request() {
        return this.request.copy();
    }

    public KFlow workflow() {
        return this.flow;
    }

    public WRecord record() {
        return this.record;
    }

    public Future<WRecord> record(final WRecord record) {
        this.record = record;
        return Ux.future(record);
    }


    // =================== Fluent Method for Set =======================

    @Fluent
    public Future<WRequest> future(final JsonObject request) {
        return Ux.future(this.request(request));
    }

    @Fluent
    public WRequest request(final JsonObject request) {
        final JsonObject params = Ut.valueJObject(request);
        this.request.mergeIn(params, true);
        return this;
    }
}