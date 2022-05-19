/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.pojos;


import cn.vertxup.erp.domain.tables.interfaces.ITOaVocation;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TOaVocation implements VertxPojo, ITOaVocation {

    private static final long serialVersionUID = 1L;

    private String        key;
    private String        commentExtension;
    private String        requestBy;
    private String        classification;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private Integer       days;
    private String        reason;
    private String        workContent;

    public TOaVocation() {}

    public TOaVocation(ITOaVocation value) {
        this.key = value.getKey();
        this.commentExtension = value.getCommentExtension();
        this.requestBy = value.getRequestBy();
        this.classification = value.getClassification();
        this.startAt = value.getStartAt();
        this.endAt = value.getEndAt();
        this.days = value.getDays();
        this.reason = value.getReason();
        this.workContent = value.getWorkContent();
    }

    public TOaVocation(
        String        key,
        String        commentExtension,
        String        requestBy,
        String        classification,
        LocalDateTime startAt,
        LocalDateTime endAt,
        Integer       days,
        String        reason,
        String        workContent
    ) {
        this.key = key;
        this.commentExtension = commentExtension;
        this.requestBy = requestBy;
        this.classification = classification;
        this.startAt = startAt;
        this.endAt = endAt;
        this.days = days;
        this.reason = reason;
        this.workContent = workContent;
    }

        public TOaVocation(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>DB_ETERNAL.T_OA_VOCATION.KEY</code>. 「key」- Ticket
     * Primary Key
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>DB_ETERNAL.T_OA_VOCATION.KEY</code>. 「key」- Ticket
     * Primary Key
     */
    @Override
    public TOaVocation setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_OA_VOCATION.COMMENT_EXTENSION</code>.
     * 「commentExtension」- Extension Comment
     */
    @Override
    public String getCommentExtension() {
        return this.commentExtension;
    }

    /**
     * Setter for <code>DB_ETERNAL.T_OA_VOCATION.COMMENT_EXTENSION</code>.
     * 「commentExtension」- Extension Comment
     */
    @Override
    public TOaVocation setCommentExtension(String commentExtension) {
        this.commentExtension = commentExtension;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_OA_VOCATION.REQUEST_BY</code>. 「requestBy」-
     * Request User
     */
    @Override
    public String getRequestBy() {
        return this.requestBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.T_OA_VOCATION.REQUEST_BY</code>. 「requestBy」-
     * Request User
     */
    @Override
    public TOaVocation setRequestBy(String requestBy) {
        this.requestBy = requestBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_OA_VOCATION.CLASSIFICATION</code>.
     * 「classification」- The ticket related business type
     */
    @Override
    public String getClassification() {
        return this.classification;
    }

    /**
     * Setter for <code>DB_ETERNAL.T_OA_VOCATION.CLASSIFICATION</code>.
     * 「classification」- The ticket related business type
     */
    @Override
    public TOaVocation setClassification(String classification) {
        this.classification = classification;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_OA_VOCATION.START_AT</code>. 「startAt」-
     * From
     */
    @Override
    public LocalDateTime getStartAt() {
        return this.startAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.T_OA_VOCATION.START_AT</code>. 「startAt」-
     * From
     */
    @Override
    public TOaVocation setStartAt(LocalDateTime startAt) {
        this.startAt = startAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_OA_VOCATION.END_AT</code>. 「endAt」- To
     */
    @Override
    public LocalDateTime getEndAt() {
        return this.endAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.T_OA_VOCATION.END_AT</code>. 「endAt」- To
     */
    @Override
    public TOaVocation setEndAt(LocalDateTime endAt) {
        this.endAt = endAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_OA_VOCATION.DAYS</code>. 「days」- Duration
     */
    @Override
    public Integer getDays() {
        return this.days;
    }

    /**
     * Setter for <code>DB_ETERNAL.T_OA_VOCATION.DAYS</code>. 「days」- Duration
     */
    @Override
    public TOaVocation setDays(Integer days) {
        this.days = days;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_OA_VOCATION.REASON</code>. 「reason」- The
     * reason to be done
     */
    @Override
    public String getReason() {
        return this.reason;
    }

    /**
     * Setter for <code>DB_ETERNAL.T_OA_VOCATION.REASON</code>. 「reason」- The
     * reason to be done
     */
    @Override
    public TOaVocation setReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_OA_VOCATION.WORK_CONTENT</code>.
     * 「workContent」- Working Assignment Content
     */
    @Override
    public String getWorkContent() {
        return this.workContent;
    }

    /**
     * Setter for <code>DB_ETERNAL.T_OA_VOCATION.WORK_CONTENT</code>.
     * 「workContent」- Working Assignment Content
     */
    @Override
    public TOaVocation setWorkContent(String workContent) {
        this.workContent = workContent;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TOaVocation (");

        sb.append(key);
        sb.append(", ").append(commentExtension);
        sb.append(", ").append(requestBy);
        sb.append(", ").append(classification);
        sb.append(", ").append(startAt);
        sb.append(", ").append(endAt);
        sb.append(", ").append(days);
        sb.append(", ").append(reason);
        sb.append(", ").append(workContent);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(ITOaVocation from) {
        setKey(from.getKey());
        setCommentExtension(from.getCommentExtension());
        setRequestBy(from.getRequestBy());
        setClassification(from.getClassification());
        setStartAt(from.getStartAt());
        setEndAt(from.getEndAt());
        setDays(from.getDays());
        setReason(from.getReason());
        setWorkContent(from.getWorkContent());
    }

    @Override
    public <E extends ITOaVocation> E into(E into) {
        into.from(this);
        return into;
    }
}
