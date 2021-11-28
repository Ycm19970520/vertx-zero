package io.vertx.tp.workflow.uca.runner;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.tp.workflow.atom.WMove;
import io.vertx.tp.workflow.init.WfPin;
import io.vertx.tp.workflow.refine.Wf;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.TaskService;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.bpm.engine.runtime.ProcessInstantiationBuilder;
import org.camunda.bpm.engine.task.Task;

import java.util.Objects;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
class RunEngine implements RunOn {
    @Override
    public Future<ProcessInstance> moveAsync(final ProcessInstance instance, final WMove move) {
        Objects.requireNonNull(instance);
        final TaskService service = WfPin.camundaTask();
        final Task task = service.createTaskQuery().active()
            .processInstanceId(instance.getId()).singleResult();
        Objects.requireNonNull(task);
        final JsonObject params = move.parameters();
        service.complete(task.getId(), params.getMap());
        Wf.Log.infoMove(this.getClass(), "[ Move ] Ended = {0}, `instance = {1}` moving with params = {2} !!!",
            instance.isEnded(), instance.getId(), params.encode());
        return Ux.future(instance);
    }

    @Override
    public Future<ProcessInstance> startAsync(final String definitionKey, final WMove move) {
        final RuntimeService service = WfPin.camundaRuntime();
        final ProcessInstantiationBuilder builder = service.createProcessInstanceByKey(definitionKey);
        final JsonObject params = move.parameters();
        if (Ut.notNil(params)) {
            // Parameters Filling
            builder.setVariables(params.getMap());
        }
        final ProcessInstance instance = builder.execute();
        Wf.Log.infoMove(this.getClass(), "[ Start ] `instance = {0}` has been started with params = {1}!!!",
            instance.getId(), params.encode());
        return Ux.future(instance);
    }

    @Override
    public Future<Boolean> stopAsync(final ProcessInstance instance) {
        final RuntimeService service = WfPin.camundaRuntime();
        // Remove the instance cascade
        return null;
    }
}