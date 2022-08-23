/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.workflow.domain.tables.pojos;


import cn.vertxup.workflow.domain.tables.interfaces.IWTodo;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class WTodo implements VertxPojo, IWTodo {

    private static final long serialVersionUID = 1L;

    private String        key;
    private String        serial;
    private String        name;
    private String        code;
    private String        icon;
    private String        status;
    private String        todoUrl;
    private String        type;
    private LocalDateTime expiredAt;
    private String        modelId;
    private String        modelKey;
    private String        modelCategory;
    private String        parentId;
    private String        serialFork;
    private String        traceId;
    private Integer       traceOrder;
    private String        taskId;
    private String        taskKey;
    private String        comment;
    private String        commentApproval;
    private String        commentReject;
    private String        toLocation;
    private String        toGroup;
    private String        toTeam;
    private String        toRole;
    private String        toUser;
    private String        toDept;
    private Boolean       escalate;
    private String        escalateData;
    private String        assignedBy;
    private LocalDateTime assignedAt;
    private String        acceptedBy;
    private String        acceptedGroup;
    private LocalDateTime acceptedAt;
    private String        finishedBy;
    private LocalDateTime finishedAt;
    private Boolean       active;
    private String        sigma;
    private String        metadata;
    private String        language;
    private LocalDateTime createdAt;
    private String        createdBy;
    private LocalDateTime updatedAt;
    private String        updatedBy;

    public WTodo() {}

    public WTodo(IWTodo value) {
        this.key = value.getKey();
        this.serial = value.getSerial();
        this.name = value.getName();
        this.code = value.getCode();
        this.icon = value.getIcon();
        this.status = value.getStatus();
        this.todoUrl = value.getTodoUrl();
        this.type = value.getType();
        this.expiredAt = value.getExpiredAt();
        this.modelId = value.getModelId();
        this.modelKey = value.getModelKey();
        this.modelCategory = value.getModelCategory();
        this.parentId = value.getParentId();
        this.serialFork = value.getSerialFork();
        this.traceId = value.getTraceId();
        this.traceOrder = value.getTraceOrder();
        this.taskId = value.getTaskId();
        this.taskKey = value.getTaskKey();
        this.comment = value.getComment();
        this.commentApproval = value.getCommentApproval();
        this.commentReject = value.getCommentReject();
        this.toLocation = value.getToLocation();
        this.toGroup = value.getToGroup();
        this.toTeam = value.getToTeam();
        this.toRole = value.getToRole();
        this.toUser = value.getToUser();
        this.toDept = value.getToDept();
        this.escalate = value.getEscalate();
        this.escalateData = value.getEscalateData();
        this.assignedBy = value.getAssignedBy();
        this.assignedAt = value.getAssignedAt();
        this.acceptedBy = value.getAcceptedBy();
        this.acceptedGroup = value.getAcceptedGroup();
        this.acceptedAt = value.getAcceptedAt();
        this.finishedBy = value.getFinishedBy();
        this.finishedAt = value.getFinishedAt();
        this.active = value.getActive();
        this.sigma = value.getSigma();
        this.metadata = value.getMetadata();
        this.language = value.getLanguage();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public WTodo(
        String        key,
        String        serial,
        String        name,
        String        code,
        String        icon,
        String        status,
        String        todoUrl,
        String        type,
        LocalDateTime expiredAt,
        String        modelId,
        String        modelKey,
        String        modelCategory,
        String        parentId,
        String        serialFork,
        String        traceId,
        Integer       traceOrder,
        String        taskId,
        String        taskKey,
        String        comment,
        String        commentApproval,
        String        commentReject,
        String        toLocation,
        String        toGroup,
        String        toTeam,
        String        toRole,
        String        toUser,
        String        toDept,
        Boolean       escalate,
        String        escalateData,
        String        assignedBy,
        LocalDateTime assignedAt,
        String        acceptedBy,
        String        acceptedGroup,
        LocalDateTime acceptedAt,
        String        finishedBy,
        LocalDateTime finishedAt,
        Boolean       active,
        String        sigma,
        String        metadata,
        String        language,
        LocalDateTime createdAt,
        String        createdBy,
        LocalDateTime updatedAt,
        String        updatedBy
    ) {
        this.key = key;
        this.serial = serial;
        this.name = name;
        this.code = code;
        this.icon = icon;
        this.status = status;
        this.todoUrl = todoUrl;
        this.type = type;
        this.expiredAt = expiredAt;
        this.modelId = modelId;
        this.modelKey = modelKey;
        this.modelCategory = modelCategory;
        this.parentId = parentId;
        this.serialFork = serialFork;
        this.traceId = traceId;
        this.traceOrder = traceOrder;
        this.taskId = taskId;
        this.taskKey = taskKey;
        this.comment = comment;
        this.commentApproval = commentApproval;
        this.commentReject = commentReject;
        this.toLocation = toLocation;
        this.toGroup = toGroup;
        this.toTeam = toTeam;
        this.toRole = toRole;
        this.toUser = toUser;
        this.toDept = toDept;
        this.escalate = escalate;
        this.escalateData = escalateData;
        this.assignedBy = assignedBy;
        this.assignedAt = assignedAt;
        this.acceptedBy = acceptedBy;
        this.acceptedGroup = acceptedGroup;
        this.acceptedAt = acceptedAt;
        this.finishedBy = finishedBy;
        this.finishedAt = finishedAt;
        this.active = active;
        this.sigma = sigma;
        this.metadata = metadata;
        this.language = language;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public WTodo(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.KEY</code>. 「key」- 待办主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.KEY</code>. 「key」- 待办主键
     */
    @Override
    public WTodo setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.SERIAL</code>. 「serial」- 待办编号，使用
     * X_NUMBER 生成
     */
    @Override
    public String getSerial() {
        return this.serial;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.SERIAL</code>. 「serial」- 待办编号，使用
     * X_NUMBER 生成
     */
    @Override
    public WTodo setSerial(String serial) {
        this.serial = serial;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.NAME</code>. 「name」- 待办名称（标题）
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.NAME</code>. 「name」- 待办名称（标题）
     */
    @Override
    public WTodo setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.CODE</code>. 「code」-
     * 待办系统码，使用流程时候关联流程的任务ID
     */
    @Override
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.CODE</code>. 「code」-
     * 待办系统码，使用流程时候关联流程的任务ID
     */
    @Override
    public WTodo setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.ICON</code>. 「icon」- 待办显示的图标
     */
    @Override
    public String getIcon() {
        return this.icon;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.ICON</code>. 「icon」- 待办显示的图标
     */
    @Override
    public WTodo setIcon(String icon) {
        this.icon = icon;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.STATUS</code>. 「status」- 待办状态
     */
    @Override
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.STATUS</code>. 「status」- 待办状态
     */
    @Override
    public WTodo setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.TODO_URL</code>. 「todoUrl」- 待办路径
     */
    @Override
    public String getTodoUrl() {
        return this.todoUrl;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.TODO_URL</code>. 「todoUrl」- 待办路径
     */
    @Override
    public WTodo setTodoUrl(String todoUrl) {
        this.todoUrl = todoUrl;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.TYPE</code>. 「type」- 待办类型
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.TYPE</code>. 「type」- 待办类型
     */
    @Override
    public WTodo setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.EXPIRED_AT</code>. 「expiredAt」- 超时时间
     */
    @Override
    public LocalDateTime getExpiredAt() {
        return this.expiredAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.EXPIRED_AT</code>. 「expiredAt」- 超时时间
     */
    @Override
    public WTodo setExpiredAt(LocalDateTime expiredAt) {
        this.expiredAt = expiredAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.MODEL_ID</code>. 「modelId」-
     * 关联的模型identifier，用于描述
     */
    @Override
    public String getModelId() {
        return this.modelId;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.MODEL_ID</code>. 「modelId」-
     * 关联的模型identifier，用于描述
     */
    @Override
    public WTodo setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.MODEL_KEY</code>. 「modelKey」-
     * 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    @Override
    public String getModelKey() {
        return this.modelKey;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.MODEL_KEY</code>. 「modelKey」-
     * 关联的模型记录ID，用于描述哪一个Model中的记录
     */
    @Override
    public WTodo setModelKey(String modelKey) {
        this.modelKey = modelKey;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.MODEL_CATEGORY</code>.
     * 「modelCategory」- 关联的category记录，只包含叶节点
     */
    @Override
    public String getModelCategory() {
        return this.modelCategory;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.MODEL_CATEGORY</code>.
     * 「modelCategory」- 关联的category记录，只包含叶节点
     */
    @Override
    public WTodo setModelCategory(String modelCategory) {
        this.modelCategory = modelCategory;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.PARENT_ID</code>. 「parentId」-
     * 待办支持父子集结构，父待办执行时候子待办同样执行
     */
    @Override
    public String getParentId() {
        return this.parentId;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.PARENT_ID</code>. 「parentId」-
     * 待办支持父子集结构，父待办执行时候子待办同样执行
     */
    @Override
    public WTodo setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.SERIAL_FORK</code>. 「serialFork」-
     * 生成序号的分支序号
     */
    @Override
    public String getSerialFork() {
        return this.serialFork;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.SERIAL_FORK</code>. 「serialFork」-
     * 生成序号的分支序号
     */
    @Override
    public WTodo setSerialFork(String serialFork) {
        this.serialFork = serialFork;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.TRACE_ID</code>. 「traceId」-
     * 同一个流程的待办执行分组
     */
    @Override
    public String getTraceId() {
        return this.traceId;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.TRACE_ID</code>. 「traceId」-
     * 同一个流程的待办执行分组
     */
    @Override
    public WTodo setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.TRACE_ORDER</code>. 「traceOrder」-
     * 待办的处理顺序
     */
    @Override
    public Integer getTraceOrder() {
        return this.traceOrder;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.TRACE_ORDER</code>. 「traceOrder」-
     * 待办的处理顺序
     */
    @Override
    public WTodo setTraceOrder(Integer traceOrder) {
        this.traceOrder = traceOrder;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.TASK_ID</code>. 「taskId」-
     * 和待办绑定的taskId（任务）
     */
    @Override
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.TASK_ID</code>. 「taskId」-
     * 和待办绑定的taskId（任务）
     */
    @Override
    public WTodo setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.TASK_KEY</code>. 「taskKey」-
     * 和待办绑定的taskKey
     */
    @Override
    public String getTaskKey() {
        return this.taskKey;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.TASK_KEY</code>. 「taskKey」-
     * 和待办绑定的taskKey
     */
    @Override
    public WTodo setTaskKey(String taskKey) {
        this.taskKey = taskKey;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.COMMENT</code>. 「comment」- 待办描述
     */
    @Override
    public String getComment() {
        return this.comment;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.COMMENT</code>. 「comment」- 待办描述
     */
    @Override
    public WTodo setComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.COMMENT_APPROVAL</code>.
     * 「commentApproval」- 审批描述
     */
    @Override
    public String getCommentApproval() {
        return this.commentApproval;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.COMMENT_APPROVAL</code>.
     * 「commentApproval」- 审批描述
     */
    @Override
    public WTodo setCommentApproval(String commentApproval) {
        this.commentApproval = commentApproval;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.COMMENT_REJECT</code>.
     * 「commentReject」- 拒绝理由
     */
    @Override
    public String getCommentReject() {
        return this.commentReject;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.COMMENT_REJECT</code>.
     * 「commentReject」- 拒绝理由
     */
    @Override
    public WTodo setCommentReject(String commentReject) {
        this.commentReject = commentReject;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.TO_LOCATION</code>. 「toLocation」-
     * 指定地址区域
     */
    @Override
    public String getToLocation() {
        return this.toLocation;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.TO_LOCATION</code>. 「toLocation」-
     * 指定地址区域
     */
    @Override
    public WTodo setToLocation(String toLocation) {
        this.toLocation = toLocation;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.TO_GROUP</code>. 「toGroup」- 指定用户组
     */
    @Override
    public String getToGroup() {
        return this.toGroup;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.TO_GROUP</code>. 「toGroup」- 指定用户组
     */
    @Override
    public WTodo setToGroup(String toGroup) {
        this.toGroup = toGroup;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.TO_TEAM</code>. 「toTeam」- 指定业务组
     */
    @Override
    public String getToTeam() {
        return this.toTeam;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.TO_TEAM</code>. 「toTeam」- 指定业务组
     */
    @Override
    public WTodo setToTeam(String toTeam) {
        this.toTeam = toTeam;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.TO_ROLE</code>. 「toRole」- 待办角色（集体）
     */
    @Override
    public String getToRole() {
        return this.toRole;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.TO_ROLE</code>. 「toRole」- 待办角色（集体）
     */
    @Override
    public WTodo setToRole(String toRole) {
        this.toRole = toRole;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.TO_USER</code>. 「toUser」- 待办指定人
     */
    @Override
    public String getToUser() {
        return this.toUser;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.TO_USER</code>. 「toUser」- 待办指定人
     */
    @Override
    public WTodo setToUser(String toUser) {
        this.toUser = toUser;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.TO_DEPT</code>. 「toDept」- 指定部门
     */
    @Override
    public String getToDept() {
        return this.toDept;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.TO_DEPT</code>. 「toDept」- 指定部门
     */
    @Override
    public WTodo setToDept(String toDept) {
        this.toDept = toDept;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.ESCALATE</code>. 「escalate」- 是否升级
     */
    @Override
    public Boolean getEscalate() {
        return this.escalate;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.ESCALATE</code>. 「escalate」- 是否升级
     */
    @Override
    public WTodo setEscalate(Boolean escalate) {
        this.escalate = escalate;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.ESCALATE_DATA</code>. 「escalateData」-
     * 升级单据数据
     */
    @Override
    public String getEscalateData() {
        return this.escalateData;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.ESCALATE_DATA</code>. 「escalateData」-
     * 升级单据数据
     */
    @Override
    public WTodo setEscalateData(String escalateData) {
        this.escalateData = escalateData;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.ASSIGNED_BY</code>. 「assignedBy」-
     * 待办指派人
     */
    @Override
    public String getAssignedBy() {
        return this.assignedBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.ASSIGNED_BY</code>. 「assignedBy」-
     * 待办指派人
     */
    @Override
    public WTodo setAssignedBy(String assignedBy) {
        this.assignedBy = assignedBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.ASSIGNED_AT</code>. 「assignedAt」- 指派时间
     */
    @Override
    public LocalDateTime getAssignedAt() {
        return this.assignedAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.ASSIGNED_AT</code>. 「assignedAt」- 指派时间
     */
    @Override
    public WTodo setAssignedAt(LocalDateTime assignedAt) {
        this.assignedAt = assignedAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.ACCEPTED_BY</code>. 「acceptedBy」-
     * 待办接收人
     */
    @Override
    public String getAcceptedBy() {
        return this.acceptedBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.ACCEPTED_BY</code>. 「acceptedBy」-
     * 待办接收人
     */
    @Override
    public WTodo setAcceptedBy(String acceptedBy) {
        this.acceptedBy = acceptedBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.ACCEPTED_GROUP</code>.
     * 「acceptedGroup」- 当前处理组
     */
    @Override
    public String getAcceptedGroup() {
        return this.acceptedGroup;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.ACCEPTED_GROUP</code>.
     * 「acceptedGroup」- 当前处理组
     */
    @Override
    public WTodo setAcceptedGroup(String acceptedGroup) {
        this.acceptedGroup = acceptedGroup;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.ACCEPTED_AT</code>. 「acceptedAt」- 接收时间
     */
    @Override
    public LocalDateTime getAcceptedAt() {
        return this.acceptedAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.ACCEPTED_AT</code>. 「acceptedAt」- 接收时间
     */
    @Override
    public WTodo setAcceptedAt(LocalDateTime acceptedAt) {
        this.acceptedAt = acceptedAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.FINISHED_BY</code>. 「finishedBy」-
     * 待办完成人
     */
    @Override
    public String getFinishedBy() {
        return this.finishedBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.FINISHED_BY</code>. 「finishedBy」-
     * 待办完成人
     */
    @Override
    public WTodo setFinishedBy(String finishedBy) {
        this.finishedBy = finishedBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.FINISHED_AT</code>. 「finishedAt」- 完成时间
     */
    @Override
    public LocalDateTime getFinishedAt() {
        return this.finishedAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.FINISHED_AT</code>. 「finishedAt」- 完成时间
     */
    @Override
    public WTodo setFinishedAt(LocalDateTime finishedAt) {
        this.finishedAt = finishedAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public WTodo setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public WTodo setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public WTodo setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public WTodo setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public WTodo setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public WTodo setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public WTodo setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.W_TODO.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.W_TODO.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public WTodo setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("WTodo (");

        sb.append(key);
        sb.append(", ").append(serial);
        sb.append(", ").append(name);
        sb.append(", ").append(code);
        sb.append(", ").append(icon);
        sb.append(", ").append(status);
        sb.append(", ").append(todoUrl);
        sb.append(", ").append(type);
        sb.append(", ").append(expiredAt);
        sb.append(", ").append(modelId);
        sb.append(", ").append(modelKey);
        sb.append(", ").append(modelCategory);
        sb.append(", ").append(parentId);
        sb.append(", ").append(serialFork);
        sb.append(", ").append(traceId);
        sb.append(", ").append(traceOrder);
        sb.append(", ").append(taskId);
        sb.append(", ").append(taskKey);
        sb.append(", ").append(comment);
        sb.append(", ").append(commentApproval);
        sb.append(", ").append(commentReject);
        sb.append(", ").append(toLocation);
        sb.append(", ").append(toGroup);
        sb.append(", ").append(toTeam);
        sb.append(", ").append(toRole);
        sb.append(", ").append(toUser);
        sb.append(", ").append(toDept);
        sb.append(", ").append(escalate);
        sb.append(", ").append(escalateData);
        sb.append(", ").append(assignedBy);
        sb.append(", ").append(assignedAt);
        sb.append(", ").append(acceptedBy);
        sb.append(", ").append(acceptedGroup);
        sb.append(", ").append(acceptedAt);
        sb.append(", ").append(finishedBy);
        sb.append(", ").append(finishedAt);
        sb.append(", ").append(active);
        sb.append(", ").append(sigma);
        sb.append(", ").append(metadata);
        sb.append(", ").append(language);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(updatedAt);
        sb.append(", ").append(updatedBy);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IWTodo from) {
        setKey(from.getKey());
        setSerial(from.getSerial());
        setName(from.getName());
        setCode(from.getCode());
        setIcon(from.getIcon());
        setStatus(from.getStatus());
        setTodoUrl(from.getTodoUrl());
        setType(from.getType());
        setExpiredAt(from.getExpiredAt());
        setModelId(from.getModelId());
        setModelKey(from.getModelKey());
        setModelCategory(from.getModelCategory());
        setParentId(from.getParentId());
        setSerialFork(from.getSerialFork());
        setTraceId(from.getTraceId());
        setTraceOrder(from.getTraceOrder());
        setTaskId(from.getTaskId());
        setTaskKey(from.getTaskKey());
        setComment(from.getComment());
        setCommentApproval(from.getCommentApproval());
        setCommentReject(from.getCommentReject());
        setToLocation(from.getToLocation());
        setToGroup(from.getToGroup());
        setToTeam(from.getToTeam());
        setToRole(from.getToRole());
        setToUser(from.getToUser());
        setToDept(from.getToDept());
        setEscalate(from.getEscalate());
        setEscalateData(from.getEscalateData());
        setAssignedBy(from.getAssignedBy());
        setAssignedAt(from.getAssignedAt());
        setAcceptedBy(from.getAcceptedBy());
        setAcceptedGroup(from.getAcceptedGroup());
        setAcceptedAt(from.getAcceptedAt());
        setFinishedBy(from.getFinishedBy());
        setFinishedAt(from.getFinishedAt());
        setActive(from.getActive());
        setSigma(from.getSigma());
        setMetadata(from.getMetadata());
        setLanguage(from.getLanguage());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    @Override
    public <E extends IWTodo> E into(E into) {
        into.from(this);
        return into;
    }
}
