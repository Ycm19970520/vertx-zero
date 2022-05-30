package io.vertx.tp.workflow.atom;

import cn.vertxup.workflow.domain.tables.pojos.WTicket;
import cn.vertxup.workflow.domain.tables.pojos.WTodo;
import cn.zeroup.macrocosm.cv.WfCv;
import cn.zeroup.macrocosm.cv.em.TodoStatus;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.tp.optic.business.ExActivity;
import io.vertx.tp.optic.component.Dictionary;
import io.vertx.tp.workflow.refine.Wf;
import io.vertx.tp.workflow.uca.modeling.ActionOn;
import io.vertx.tp.workflow.uca.runner.StoreOn;
import io.vertx.up.eon.KName;
import io.vertx.up.eon.em.ChangeFlag;
import io.vertx.up.unity.Ux;
import io.vertx.up.util.Ut;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @author <a href="http://www.origin-x.cn">Lang</a>
 */
public class WRecord implements Serializable {
    private final transient ConcurrentMap<String, JsonArray> linkage = new ConcurrentHashMap<>();
    private final transient JsonObject child = new JsonObject();
    private final transient JsonObject dataAfter = new JsonObject();
    // Change Flag for activity
    private final transient ChangeFlag tabb;
    /*
     * This variable stored prev record when do different operation
     * 1) ADD:          prev = null
     * 2) UPDATE:       prev = value
     * 3) DELETE:       prev = value
     *
     * When current record data() called, the original record stored in
     * __data node and write __flag node for normalization
     */
    private transient WRecord prev;
    // Before WRecord
    private transient WTicket ticket;
    private transient WTodo todo;

    private WRecord(final ChangeFlag tabb) {
        this.tabb = tabb;
    }

    private WRecord() {
        this(null);
    }

    public static WRecord create() {
        return create(false, null);
    }

    public static WRecord create(final boolean write, final ChangeFlag flag) {
        if (write) {
            Objects.requireNonNull(flag);
            /*
             * Write mode for WRecord, it stored prev record reference
             * for update data in comparing code logical
             * Here are two constructors:
             *
             * 1) with flag: identify the record operation
             * 2) without flag: the flag = null
             */
            return new WRecord(flag).prev(new WRecord());
        } else {
            /*
             * Read mode only, it will ignore prev record reference
             */
            return new WRecord();
        }
    }

    // ------------- Reference for original record

    public WRecord prev() {
        return this.prev;
    }

    public WRecord prev(final WRecord prev) {
        this.prev = prev;
        return this;
    }

    // ------------- Response Build
    /*
     *  Empty Response Build
     *  - WTodo = null
     *  - WTicket = null
     */
    public WRecord bind() {
        this.todo = null;
        this.ticket = null;
        return this;
    }

    /*
     *  Success Response Build
     *  - WTicket = {} with JsonObject ( Child )
     *  - WTodo = {}
     *  - history = []
     *  - linkageXX = []
     *
     *  1. Ticket Full Data = WTicket + <Extension> = {}
     *     Extension Ticket primary key is the same as Ticket
     *  2. History should be JsonArray ( Captured WTodo / Camunda Task )
     *  3. Linkage should be related to current WTodo record
     */
    public WRecord bind(final WTicket ticket) {
        this.ticket = ticket;
        return this;
    }

    public WRecord bind(final WTodo todo) {
        this.todo = todo;
        return this;
    }

    /*
     * Child Bind
     */
    public WRecord bind(final JsonObject child) {
        if (Ut.notNil(child)) {
            this.child.mergeIn(child.copy());
        }
        return this;
    }

    /*
     * Linkage Bind
     */
    public WRecord linkage(final String field, final JsonArray linkage) {
        final JsonArray data = Ut.valueJArray(linkage);
        this.linkage.put(field, data);
        return this;
    }


    // ------------- Field Get
    /*
     * Different Field for usage here
     * - todo()                         WTodo instance
     * - ticket()                       WTicket instance
     * - identifier()                   WTicket ( modelId field ) for uniform model identifier
     * - key()                          WTicket ( modelKey field ) for model record primary key
     * - status()                       Todo Status ( Original Status stored in database )
     */
    public WTodo todo() {
        return this.todo;
    }

    public WTicket ticket() {
        return this.ticket;
    }

    public JsonObject child() {
        return this.child;
    }

    public String identifier() {
        return this.ticket.getModelId();
    }

    public String key() {
        return this.ticket.getModelKey();
    }

    /*
     * These two methods are only called when UPDATING todo
     * Here the `status` field stored the original status of W_TODO
     * for future usage:
     * - Update the actual records by ActionOn
     * - Update the related records by ActionOn
     */
    public TodoStatus status() {
        if (Objects.isNull(this.prev) || Objects.isNull(this.prev.todo)) {
            return null;
        }
        final WTodo todo = this.prev.todo;
        return Ut.toEnum(todo::getStatus, TodoStatus.class, null);
    }

    // ------------- Async Code Logical
    /*
     * Async code logical for Future usage here
     * - futureJ()                      WTicket + WTodo only
     * - futureJ(Boolean)               WTicket + WTodo
     *                                  Linkage Fields
     *                                  history ( Tracking )
     */
    public Future<JsonObject> futureJ() {
        return Ux.future(this.data());
    }

    public Future<JsonObject> futureJ(final boolean history) {
        // Here read `flowProcessId`
        final String instanceId = this.ticket.getFlowInstanceId();
        final JsonObject response = this.data();
        return Wf.definition(instanceId)
            // WProcessDefinition put into response data
            .compose(process -> this.dataProcess(process, history))
            // WTicket / WTodo data part of current code logical
            .compose(workflow -> this.dataTicket(response, workflow))
            // `history` field mount
            .compose(this::dataHistory)
            .compose(Ux.attachJ(KName.HISTORY, response));
    }

    public Future<WRecord> futureAfter(final JsonObject dataAfter) {
        if (Ut.notNil(dataAfter)) {
            this.dataAfter.clear();
            this.dataAfter.mergeIn(dataAfter, true);
        }
        return Ux.future(this);
    }

    // ------------- Response Building -------------------------
    private Future<JsonObject> dataTicket(final JsonObject response, final JsonObject workflow) {
        // Record based on start
        final EngineOn engine = EngineOn.connect(workflow.getString(KName.Flow.DEFINITION_KEY));
        final MetaInstance metadataInput = engine.metadata();
        // Record Action processing
        final ActionOn action = ActionOn.action(metadataInput.recordMode());
        // Record of Todo processing
        final MetaInstance metadataOutput = MetaInstance.output(this, metadataInput);
        if (metadataOutput.recordSkip()) {
            return Ux.future(response);
        }
        // Record for different fetch
        final String modelKey = this.ticket.getModelKey();
        if (Objects.isNull(modelKey)) {
            final Set<String> keys = Ut.toSet(Ut.toJArray(this.ticket.getModelChild()));
            return action.fetchAsync(keys, this.ticket.getModelId(),
                metadataOutput).compose(array -> {
                // record processing
                response.put(KName.RECORD, array);
                return Ux.future(response);
            });
        } else {
            return action.fetchAsync(this.ticket.getModelKey(), this.ticket.getModelId(),
                metadataOutput).compose(json -> {
                // record processing
                response.put(KName.RECORD, json);
                return Ux.future(response);
            });
        }
    }

    private Future<JsonObject> dataProcess(final WProcessDefinition process, final boolean history) {
        // Fix: NullPointer for Process Exception
        if (Objects.isNull(process)) {
            return Ux.futureJ();
        }
        /*
         * history to switch
         * 1. instance(), history = false
         * 2. instanceFinished(), history = true
         */
        // this.process = process;
        final StoreOn storeOn = StoreOn.get();
        if (history) {
            // Fetch History Only
            return storeOn.workflowGet(process.definition(),
                process.instanceFinished());
        } else {
            // Fetch Workflow
            return storeOn.workflowGet(process.definition(),
                process.instance());
        }
    }

    private Future<JsonArray> dataHistory(final JsonObject processed) {
        /*
         * Condition:
         * 1. traceId is the same as all todo
         * 2. key is not equal todo key
         * 3. status should be FINISHED/REJECTED
         */

            /*
            OLD Code ( Get X_TODO )
            final JsonObject criteria = Ux.whereAnd();
            criteria.put(KName.Flow.TRACE_ID, this.ticket.getKey());
            if (!history && Objects.nonNull(this.todo)) {
                criteria.put(KName.KEY + ",<>", this.todo.getKey());
            }
            criteria.put(KName.STATUS, new JsonArray()
                .add(TodoStatus.FINISHED.name())
                .add(TodoStatus.REJECTED.name())
                .add(TodoStatus.CANCELED.name())
            );
            return Ux.Jooq.on(WTodoDao.class).fetchAsync(criteria)
                .compose(Ux::futureA);*/
        /*
         * 1) Fetch catalog first
         * 2) Convert Catalog to extract identifier
         * 3) Build `modelId` and `modelKey`
         */
        return Ux.channel(Dictionary.class, JsonArray::new,
                dict -> dict.fetchTree(this.ticket.getSigma(), WfCv.CODE_CATALOG))
            .compose(dict -> {
                final ConcurrentMap<String, String> mapId = new ConcurrentHashMap<>();
                Ut.itJArray(dict).forEach(record -> {
                    final String code = record.getString(KName.CODE);
                    final String identifier = record.getString(KName.IDENTIFIER);
                    if (Objects.nonNull(code) && Objects.nonNull(identifier)) {
                        mapId.put(code, identifier);
                    }
                });
                return Ux.future(mapId);
            })
            .compose(map -> Ux.channel(ExActivity.class, JsonArray::new, activity -> {
                final String modelId = map.getOrDefault(this.ticket.getCatalog(), null);
                if (Objects.isNull(modelId)) {
                    return Ux.futureA();
                }
                return activity.activities(modelId, this.ticket.getKey());
            }));
    }

    // ------------- Data Building -------------------------
    /*
     * Data Specification of current record:
     * {
     *      "ticket.field1": "value1",
     *      "ticket.field2": "value2",
     *      "...": "..."
     *      "modelChild": [
     *          "when multi entities"
     *      ],
     *
     *      "serial": "ticket serial",
     *      "code": "ticket code"
     *      "traceKey": "ticket field",
     *
     *      "key": "todo field",
     *      "taskCode": "todo code",
     *      "taskSerial": "todo serial"
     * }
     *
     *
     *
     * Json Data for following critical in data structure
     * 1. Camunda Workflow
     *  - flowDefinitionKey                 - Process Definition Key
     *  - flowDefinitionId                  - Process Definition Key/Id
     *                                        ( Different workflow instance contain different id )
     *  - flowEnd                           - Whether workflow is ended
     *  - flowInstanceId                    - Process Instance Key
     *
     *  - taskKey                           - Task Definition Key
     *  - taskCode                          - Todo Serial ( -01, -02, -03 )
     *  - taskId                            - Task Id ( Camunda Workflow Id )
     *
     *
     * 2. Critical Key
     *  - key                               - W_TODO primary key
     *  - traceKey                          - W_TICKET primary key ( ticket extension key )
     *
     *
     * 3. Entity Part
     *  - modelId                           - Entity identifier
     *  - modelKey                          - 「Single Record」Primary Key of JsonObject entity record
     *  - modelChild ( With quantity )      - 「Multi Record」Primary Keys of JsonArray entity records
     */
    public JsonObject data() {
        // prev may be empty, it means that could not call old data
        // Objects.requireNonNull(this.ticket);
        final JsonObject response = new JsonObject();
        if (Objects.nonNull(this.ticket)) {
            /*
             * 1. Mount Data to WTicket
             *  - modelChild -> []
             *  - traceKey   -> WTicket -> key
             */
            this.onTicket(response);


            /*
             * 2. Mount Todo to WTicket
             *  - taskCode   -> WTodo -> code
             *  - taskSerial -> WTodo -> serial
             *  - key        -> WTodo -> key
             */
            this.onTodo(response);


            /*
             * 3. Mount Compare
             *  - __data     -> Previous Data
             *  - __flag     -> Previous Flag
             *  - Mount dataAfter   -> Removed ( key, serial, code )
             */
            this.onCompare(response);


            /*
             * 4. Mount Child Ticket
             *  - Set `traceKey` to `key` and removed key
             *  -> Mount childJ     -> Removed ( key )
             */
            this.onChild(response);
        }
        return response;
    }

    private void onCompare(final JsonObject response) {
        if (Objects.nonNull(this.prev)) {
            // Data Original, UPDATE Only
            final JsonObject dataPrev = this.prev.data();
            if (Ut.notNil(dataPrev)) {
                response.put(KName.__.DATA, this.prev.data());
            }
        }
        // Operation on Record
        if (Objects.nonNull(this.tabb)) {
            response.put(KName.__.FLAG, this.tabb);
        }
        // AOP Data After
        final JsonObject dataAfter = this.dataAfter.copy();
        dataAfter.remove(KName.KEY);
        dataAfter.remove(KName.CODE);
        dataAfter.remove(KName.SERIAL);
        response.mergeIn(dataAfter, true);
    }

    private void onTicket(final JsonObject response) {
        final JsonObject ticketJ = Ux.toJson(this.ticket);
        Ut.ifJObject(ticketJ, KName.MODEL_CHILD);
        // WTicket
        // traceKey <- key
        ticketJ.put(KName.Flow.TRACE_KEY, this.ticket.getKey());
        response.mergeIn(ticketJ, true);
    }

    private void onTodo(final JsonObject response) {
        if (Objects.nonNull(this.todo)) {
            final JsonObject todoJson = Ux.toJson(this.todo);
            todoJson.remove(KName.SERIAL);
            todoJson.remove(KName.CODE);
            response.mergeIn(todoJson, true);
            // WTodo
            // taskCode <- code
            // taskSerial <- serial
            response.put(KName.Flow.TASK_CODE, this.todo.getCode());
            response.put(KName.Flow.TASK_SERIAL, this.todo.getSerial());
        }
    }

    private void onChild(final JsonObject result) {
        // Linkage Data Put
        this.linkage.forEach(result::put);
        // Child
        if (Ut.notNil(this.child)) {
            /*
             * Switch `key` and `traceKey` instead of all records
             * - `key` field is W_TODO record primary key
             * - `traceKey` field is W_TICKET record primary key
             *
             * Please be careful about following.
             */
            final JsonObject childJ = this.child.copy();
            if (!result.containsKey(KName.Flow.TRACE_KEY)) {
                result.put(KName.Flow.TRACE_KEY, childJ.getValue(KName.KEY));
            }
            childJ.remove(KName.KEY);
            result.mergeIn(childJ);
        }
    }
}
