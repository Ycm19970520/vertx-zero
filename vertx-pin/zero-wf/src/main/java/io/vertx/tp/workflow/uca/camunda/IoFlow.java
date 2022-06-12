package io.vertx.tp.workflow.uca.camunda;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.tp.error._409InValidInstanceException;
import io.vertx.tp.workflow.refine.Wf;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import org.camunda.bpm.engine.history.HistoricProcessInstance;
import org.camunda.bpm.engine.repository.ProcessDefinition;
import org.camunda.bpm.engine.runtime.ProcessInstance;
import org.camunda.bpm.model.bpmn.instance.EndEvent;
import org.camunda.bpm.model.bpmn.instance.StartEvent;

import java.util.Objects;
import java.util.Set;

/**
 * S - Start Flow
 *
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class IoFlow extends AbstractIo<JsonObject> {

    // 「IoRuntime」ProcessDefinition before workflow start
    /*
     * Workflow Output
     * {
     *      "definitionId": "???",
     *      "definitionKey": "???",
     *      "bpmn": "???",
     *      "name": "???",
     *      "task": "???",
     *      "multiple": "???"
     * }
     */
    @Override
    public Future<JsonObject> start(final String definitionId) {
        final ProcessDefinition definition = this.inProcess(definitionId);
        final JsonObject workflow = Wf.bpmnOut(definition);

        // Capture the definition from BPMN
        final Io<StartEvent> ioStart = Io.ioEventStart();
        return Ux.future(definition.getId())
            // Workflow Fetching
            .compose(ioStart::child)
            .compose(starts -> ioStart.out(workflow, starts));
    }

    // 「IoRuntime」Instance when the workflow is running
    /*
     * Workflow Output
     * {
     *      "definitionId": "???",
     *      "definitionKey": "???",
     *      "bpmn": "???",
     *      "name": "???",
     *      "history": []
     * }
     */
    @Override
    public Future<JsonObject> run(final String instanceId) {
        final ProcessInstance instance = this.inInstance(instanceId);
        if (Objects.isNull(instance)) {
            return Ux.thenError(_409InValidInstanceException.class, this.getClass(), instanceId);
        }
        final ProcessDefinition definition = this.inProcess(instance.getProcessDefinitionId());

        return null;
    }

    // 「IoRuntime」Instance when the workflow is finished
    /*
     * Workflow Output
     * {
     *      "definitionId": "???",
     *      "definitionKey": "???",
     *      "bpmn": "???",
     *      "name": "???",
     *      "history": []
     * }
     */
    @Override
    public Future<JsonObject> end(final String instanceId) {
        /*
         * 1. ProcessDefinition
         * 2. HistoricProcessInstance
         */
        final HistoricProcessInstance instance = this.inHistoric(instanceId);
        if (Objects.isNull(instance)) {
            return Ux.thenError(_409InValidInstanceException.class, this.getClass(), instanceId);
        }
        final ProcessDefinition definition = this.inProcess(instance.getProcessDefinitionId());

        final JsonObject workflow = Wf.bpmnOut(definition);
        final Io<EndEvent> ioEnd = Io.ioEventEnd();
        final Io<Set<String>> ioHistory = Io.ioHistory();
        return Ux.future(definition.getId())
            // Workflow Fetching
            .compose(ioEnd::children)
            .compose(ends -> ioEnd.out(workflow, ends))

            // History Fetching
            .compose(nil -> ioHistory.end(instanceId))
            .compose(historySet -> ioHistory.out(workflow, historySet));
    }

    @Override
    public Future<JsonObject> out(final JsonObject response, final JsonObject workflow) {
        if (Ut.notNil(workflow)) {
            response.put(KName.Flow.WORKFLOW, workflow);
        }
        return Ux.future(response);
    }
}
