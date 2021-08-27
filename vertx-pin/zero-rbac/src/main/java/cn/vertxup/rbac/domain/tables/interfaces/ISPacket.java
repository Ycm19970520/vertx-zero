/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.rbac.domain.tables.interfaces;


import java.io.Serializable;
import java.time.LocalDateTime;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ISPacket extends Serializable {

    /**
     * Setter for <code>DB_ETERNAL.S_PACKET.KEY</code>. 「key」- 包信息
     */
    public ISPacket setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PACKET.KEY</code>. 「key」- 包信息
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.S_PACKET.PATH_ID</code>. 「pathId」- 关联的 path id，包含关系
     */
    public ISPacket setPathId(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PACKET.PATH_ID</code>. 「pathId」- 关联的 path id，包含关系
     */
    public String getPathId();

    /**
     * Setter for <code>DB_ETERNAL.S_PACKET.RESOURCE_ID</code>. 「resourceId」- 关联的资源 id
     */
    public ISPacket setResourceId(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PACKET.RESOURCE_ID</code>. 「resourceId」- 关联的资源 id
     */
    public String getResourceId();

    /**
     * Setter for <code>DB_ETERNAL.S_PACKET.ROW_TYPE</code>. 「rowType」- 行过滤类型
     */
    public ISPacket setRowType(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PACKET.ROW_TYPE</code>. 「rowType」- 行过滤类型
     */
    public String getRowType();

    /**
     * Setter for <code>DB_ETERNAL.S_PACKET.ROW_FIELD</code>. 「rowField」- 行输入
     */
    public ISPacket setRowField(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PACKET.ROW_FIELD</code>. 「rowField」- 行输入
     */
    public String getRowField();

    /**
     * Setter for <code>DB_ETERNAL.S_PACKET.ROW_TPL</code>. 「rowTpl」- 多字段的模板
     */
    public ISPacket setRowTpl(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PACKET.ROW_TPL</code>. 「rowTpl」- 多字段的模板
     */
    public String getRowTpl();

    /**
     * Setter for <code>DB_ETERNAL.S_PACKET.ROW_TPL_MAPPING</code>. 「rowTplMapping」- 多字段的映射关系
     */
    public ISPacket setRowTplMapping(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PACKET.ROW_TPL_MAPPING</code>. 「rowTplMapping」- 多字段的映射关系
     */
    public String getRowTplMapping();

    /**
     * Setter for <code>DB_ETERNAL.S_PACKET.COL_TYPE</code>. 「colType」- 列过滤类型
     */
    public ISPacket setColType(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PACKET.COL_TYPE</code>. 「colType」- 列过滤类型
     */
    public String getColType();

    /**
     * Setter for <code>DB_ETERNAL.S_PACKET.COL_CONFIG</code>. 「colConfig」- 列配置
     */
    public ISPacket setColConfig(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PACKET.COL_CONFIG</code>. 「colConfig」- 列配置
     */
    public String getColConfig();

    /**
     * Setter for <code>DB_ETERNAL.S_PACKET.COND_TPL</code>. 「condTpl」- 条件模板
     */
    public ISPacket setCondTpl(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PACKET.COND_TPL</code>. 「condTpl」- 条件模板
     */
    public String getCondTpl();

    /**
     * Setter for <code>DB_ETERNAL.S_PACKET.COND_TPL_MAPPING</code>. 「condTplMapping」- 查询条件映射关系
     */
    public ISPacket setCondTplMapping(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PACKET.COND_TPL_MAPPING</code>. 「condTplMapping」- 查询条件映射关系
     */
    public String getCondTplMapping();

    /**
     * Setter for <code>DB_ETERNAL.S_PACKET.COND_CONFIG</code>. 「condConfig」- 条件配置（界面配置相关）
     */
    public ISPacket setCondConfig(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PACKET.COND_CONFIG</code>. 「condConfig」- 条件配置（界面配置相关）
     */
    public String getCondConfig();

    /**
     * Setter for <code>DB_ETERNAL.S_PACKET.SIGMA</code>. 「sigma」- 统一标识
     */
    public ISPacket setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PACKET.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.S_PACKET.LANGUAGE</code>. 「language」- 使用的语言
     */
    public ISPacket setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PACKET.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.S_PACKET.ACTIVE</code>. 「active」- 是否启用
     */
    public ISPacket setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.S_PACKET.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.S_PACKET.METADATA</code>. 「metadata」- 附加配置数据
     */
    public ISPacket setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PACKET.METADATA</code>. 「metadata」- 附加配置数据
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.S_PACKET.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public ISPacket setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.S_PACKET.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.S_PACKET.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public ISPacket setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PACKET.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.S_PACKET.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public ISPacket setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.S_PACKET.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.S_PACKET.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public ISPacket setUpdatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.S_PACKET.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface ISPacket
     */
    public void from(cn.vertxup.rbac.domain.tables.interfaces.ISPacket from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface ISPacket
     */
    public <E extends cn.vertxup.rbac.domain.tables.interfaces.ISPacket> E into(E into);

    default ISPacket fromJson(io.vertx.core.json.JsonObject json) {
        setKey(json.getString("KEY"));
        setPathId(json.getString("PATH_ID"));
        setResourceId(json.getString("RESOURCE_ID"));
        setRowType(json.getString("ROW_TYPE"));
        setRowField(json.getString("ROW_FIELD"));
        setRowTpl(json.getString("ROW_TPL"));
        setRowTplMapping(json.getString("ROW_TPL_MAPPING"));
        setColType(json.getString("COL_TYPE"));
        setColConfig(json.getString("COL_CONFIG"));
        setCondTpl(json.getString("COND_TPL"));
        setCondTplMapping(json.getString("COND_TPL_MAPPING"));
        setCondConfig(json.getString("COND_CONFIG"));
        setSigma(json.getString("SIGMA"));
        setLanguage(json.getString("LANGUAGE"));
        setActive(json.getBoolean("ACTIVE"));
        setMetadata(json.getString("METADATA"));
        // Omitting unrecognized type java.time.LocalDateTime for column CREATED_AT!
        setCreatedBy(json.getString("CREATED_BY"));
        // Omitting unrecognized type java.time.LocalDateTime for column UPDATED_AT!
        setUpdatedBy(json.getString("UPDATED_BY"));
        return this;
    }


    default io.vertx.core.json.JsonObject toJson() {
        io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
        json.put("KEY",getKey());
        json.put("PATH_ID",getPathId());
        json.put("RESOURCE_ID",getResourceId());
        json.put("ROW_TYPE",getRowType());
        json.put("ROW_FIELD",getRowField());
        json.put("ROW_TPL",getRowTpl());
        json.put("ROW_TPL_MAPPING",getRowTplMapping());
        json.put("COL_TYPE",getColType());
        json.put("COL_CONFIG",getColConfig());
        json.put("COND_TPL",getCondTpl());
        json.put("COND_TPL_MAPPING",getCondTplMapping());
        json.put("COND_CONFIG",getCondConfig());
        json.put("SIGMA",getSigma());
        json.put("LANGUAGE",getLanguage());
        json.put("ACTIVE",getActive());
        json.put("METADATA",getMetadata());
        // Omitting unrecognized type java.time.LocalDateTime for column CREATED_AT!
        json.put("CREATED_BY",getCreatedBy());
        // Omitting unrecognized type java.time.LocalDateTime for column UPDATED_AT!
        json.put("UPDATED_BY",getUpdatedBy());
        return json;
    }

}
