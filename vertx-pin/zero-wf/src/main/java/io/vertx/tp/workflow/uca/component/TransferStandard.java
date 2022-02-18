package io.vertx.tp.workflow.uca.component;

import cn.vertxup.workflow.domain.tables.pojos.WTicket;
import cn.zeroup.macrocosm.cv.em.TodoStatus;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.tp.workflow.atom.*;
import io.vertx.tp.workflow.uca.runner.IsOn;
import io.vertx.up.eon.KName;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;
import org.camunda.bpm.engine.task.Task;

import java.util.Objects;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class TransferStandard extends AbstractTodo implements Transfer {
    @Override
    public Future<WRecord> moveAsync(final JsonObject params, final WProcess wProcess) {
        // Update current todo information
        final JsonObject updatedData = KtTodo.closeJ(params, wProcess);
        /*
         * Check if create new ticket with todo here.
         * 1. Submit Direct
         * 2. Create new record here:
         * -- saveAsync instead of updateAsync
         * -- create new ticket
         * -- create new todo
         */
        return this.saveAsync(updatedData, wProcess.instance())
            // Record Updating or Not
            .compose(record -> this.updateRecord(record, params, wProcess))
            .compose(record -> wProcess.next().compose(taskNext -> {
                /*
                 * Todo Generation Condition
                 * 1. Instance is not ended
                 * 2. Next task is UserEvent
                 */
                final IsOn is = IsOn.get();
                if (wProcess.isContinue() && is.isUserEvent(taskNext)) {
                    /*
                     * Create new WProcess based on process / task and move
                     *
                     * Here instance contains previous data such as:
                     * 1. Task
                     * 2. ConfigRunner is runConfig
                     * 3. ProcessInstance
                     *
                     * The WMove should be generated by
                     * 1. Previous task definition key
                     * 2. Data with
                     */
                    final WProcess instanceNext = WProcess.create();
                    {
                        final Task task = wProcess.task();
                        final WMove move = this.moveGet(task.getTaskDefinitionKey());
                        move.stored(params);
                        instanceNext.bind(taskNext).bind(move).bind(wProcess.instance());
                    }
                    return this.generateAsync(record, instanceNext);
                } else {
                    return Ux.future(record);
                }
            }));
    }

    private Future<WRecord> updateRecord(final WRecord wRecord, final JsonObject params, final WProcess instance) {
        /*
         * Double check for `insert record`
         * Here will execute twice on entity record instead of one
         * 1. Insert -> Move Update
         * 2. Update -> Move Update
         */
        final WTicket ticket = wRecord.ticket();
        Objects.requireNonNull(ticket);
        final MetaInstance metadata = MetaInstance.output(wRecord);
        if (!params.containsKey(KName.MODEL_KEY)) {
            params.put(KName.MODEL_KEY, ticket.getKey());
        }
        return this.saveAsync(params, metadata).compose(processed -> {
            final TodoStatus status = wRecord.status();
            final JsonObject request = processed.copy();
            if (TodoStatus.DRAFT == status) {
                /*
                 * Draft -> Pending, no decision field processing
                 */
                return this.updateAsync(request, metadata).compose(nil -> Ux.future(wRecord));
            } else if (TodoStatus.PENDING == status) {
                final WMoveRule moveRule = instance.rule();
                if (Objects.nonNull(moveRule) && Ut.notNil(moveRule.getRecord())) {
                    /*
                     * Here will fetch record auto
                     * Critical step to update `record` field here
                     */
                    final JsonObject record = Ut.sureJObject(request.getJsonObject(KName.RECORD));
                    record.mergeIn(moveRule.getRecord());
                    request.put(KName.RECORD, record);
                    /*
                     * Contains record modification, do update on record.
                     */
                    return this.updateAsync(request, metadata).compose(nil -> Ux.future(wRecord));
                }
            }
            return Ux.future(wRecord);
        });
    }
}
