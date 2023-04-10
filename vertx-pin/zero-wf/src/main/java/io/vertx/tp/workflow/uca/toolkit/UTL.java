package io.vertx.tp.workflow.uca.toolkit;

import cn.vertxup.workflow.domain.tables.pojos.WTicket;
import cn.vertxup.workflow.domain.tables.pojos.WTodo;
import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.tp.workflow.atom.runtime.WRecord;
import io.vertx.tp.workflow.atom.runtime.WTransition;
import io.vertx.up.eon.em.ChangeFlag;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

import java.util.List;
import java.util.Objects;

public class UTL {

    public static WRecord recordU(final WTransition transition) {
        return WRecord.create(true, ChangeFlag.UPDATE).bind(transition.vague());
    }

    public static WRecord recordA(final WTransition transition) {
        return WRecord.create(true, ChangeFlag.ADD).bind(transition.vague());
    }

    public static Future<WRecord> afterInsert(final WTicket ticket, final WTransition transition) {
        final WRecord record = recordA(transition);
        record.ticket(ticket);
        return Ux.future(record);
    }

    // ----------------------------- Before / After -------------------------------

    public static Future<WRecord> beforeUpdate(final WRecord generated, final WTodo todo, final JsonObject requestJ) {
        /*
         * Old Task Processing
         */
        final WRecord prev = generated.prev();
        if (Objects.nonNull(prev)) {
            prev.task(todo);
        }
        if (Ut.notNil(requestJ)) {
            return generated.futureAfter(requestJ);
        } else {
            return Ux.future(generated);
        }
    }

    public static Future<WRecord> beforeUpdatePre(final WRecord record, final WRecord generated) {
        /*
         * Fix $zo has no value here
         * Here the bind must happen on matrix:
         *
         * WTodo        OLD            NEW
         *  Prev         o              x ( Will be Closed )
         *  Generated    x              o
         *
         * <Prev,New> OLD -> <null, New> New
         * The new record has been generated by OLD ( New Status )
         * In this kind of situation, the prev must be OLD ( Prev Status )
         *
         * Here are smart process:
         */
        final WRecord prev = record.prev();
        if (Objects.isNull(prev)) {
            generated.prev(record);
        } else {
            generated.prev(prev);
        }
        return Ux.future(generated);
    }

    public static Future<WRecord> beforeUpdate(final JsonObject ticketJ, final WRecord queried) {
        /*
         * Because of updating on child record
         * The `original` child JsonObject must exist and also you
         * should bind the `original` child JsonObject to
         * `prev` ( Previous ) record reference.
         */
        Objects.requireNonNull(ticketJ);
        final WRecord prev = queried.prev();
        if (Objects.nonNull(prev) && Ut.isNil(prev.child())) {
            /*
             * 「Record」Bind Original
             *  Prev Record Binding need copy of previous version
             *  include WTicket / WTodo / Child ( JsonObject )
             */
            prev.ticket(ticketJ.copy());
        }
        return Ux.future(queried);
    }

    /*
     * Here recordRef contains:
     * 1) Current record data
     * 2) Prev record reference
     *
     * 「Record」Bind Original
     *  Prev Record Binding need copy of previous version
     *  include WTicket / WTodo / Child ( JsonObject )
     *
     * Old Code:
     * Objects.requireNonNull(recordRef.prev());
     * final WRecord prev = recordRef.prev();
     * prev.ticket(new WTicket(ticket));
     */
    public static Future<WRecord> beforeUpdate(final WTicket ticketIn, final WRecord queried) {
        Objects.requireNonNull(queried.prev());
        final WRecord prev = queried.prev();
        if (Objects.isNull(prev.ticket())) {
            /*
             * Here add the checking on recordRef ( previous )
             * Any way, when the previous recordRef has been bind to existing ticket ( not null ),
             * it means that some binding code logical happened before current position, in this kind of
             * situation, you can consider the previous record keep original ticket data.
             *
             * 1) Finished -> Generate ( Here are two tickets related )
             * 2) Common situation ( The prev record ticket must be null )
             */
            prev.ticket(new WTicket(ticketIn));
        }
        return Ux.future(queried);
    }

    public static Future<WRecord> beforeUpdate(final WTodo todoIn, final WRecord record) {
        Objects.requireNonNull(todoIn);
        final WRecord prev = record.prev();
        if (Objects.nonNull(prev) && Objects.isNull(prev.todo())) {
            /*
             * 「Record」Bind Original
             *  Prev Record Binding need copy of previous version
             *  include WTicket / WTodo / Child ( JsonObject )
             */
            prev.task(new WTodo(todoIn));
        }
        return Ux.future(record);
    }

    public static Future<WRecord> afterUpdate(final WTicket ticket, final WRecord current) {
        // 「Record」Bind Updated
        current.ticket(ticket);
        return Ux.future(current);
    }

    public static Future<WRecord> afterUpdate(final JsonObject ticketJ, final WRecord current) {
        // 「Record」Bind Updated
        current.ticket(ticketJ);
        return Ux.future(current);
    }

    public static Future<WRecord> afterUpdate(final WTodo todo, final WRecord current) {
        // 「Record」Bind Updated
        current.task(todo);
        return Ux.future(current);
    }

    public static Future<WRecord> afterUpdate(final List<WTodo> todos, final WRecord current) {
        // 「Record」Bind Updated
        current.task(todos);
        return Ux.future(current);
    }
}
