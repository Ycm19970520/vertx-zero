/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.workflow.domain.tables.pojos;


import cn.vertxup.workflow.domain.tables.interfaces.ITAssetIn;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TAssetIn implements VertxPojo, ITAssetIn {

    private static final long serialVersionUID = 1L;

    private String key;
    private String commentIn;

    public TAssetIn() {}

    public TAssetIn(ITAssetIn value) {
        this.key = value.getKey();
        this.commentIn = value.getCommentIn();
    }

    public TAssetIn(
        String key,
        String commentIn
    ) {
        this.key = key;
        this.commentIn = commentIn;
    }

        public TAssetIn(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>DB_ETERNAL.T_ASSET_IN.KEY</code>. 「key」-
     * 单据主键（主单主键Join模式）
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>DB_ETERNAL.T_ASSET_IN.KEY</code>. 「key」-
     * 单据主键（主单主键Join模式）
     */
    @Override
    public TAssetIn setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.T_ASSET_IN.COMMENT_IN</code>. 「commentIn」-
     * 入库备注
     */
    @Override
    public String getCommentIn() {
        return this.commentIn;
    }

    /**
     * Setter for <code>DB_ETERNAL.T_ASSET_IN.COMMENT_IN</code>. 「commentIn」-
     * 入库备注
     */
    @Override
    public TAssetIn setCommentIn(String commentIn) {
        this.commentIn = commentIn;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TAssetIn (");

        sb.append(key);
        sb.append(", ").append(commentIn);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(ITAssetIn from) {
        setKey(from.getKey());
        setCommentIn(from.getCommentIn());
    }

    @Override
    public <E extends ITAssetIn> E into(E into) {
        into.from(this);
        return into;
    }
}