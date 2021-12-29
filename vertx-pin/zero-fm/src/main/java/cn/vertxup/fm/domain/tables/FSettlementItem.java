/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.fm.domain.tables;


import cn.vertxup.fm.domain.Db;
import cn.vertxup.fm.domain.Indexes;
import cn.vertxup.fm.domain.Keys;
import cn.vertxup.fm.domain.tables.records.FSettlementItemRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class FSettlementItem extends TableImpl<FSettlementItemRecord> {

    /**
     * The reference instance of <code>DB_ETERNAL.F_SETTLEMENT_ITEM</code>
     */
    public static final FSettlementItem F_SETTLEMENT_ITEM = new FSettlementItem();
    private static final long serialVersionUID = 1L;
    /**
     * The column <code>DB_ETERNAL.F_SETTLEMENT_ITEM.KEY</code>. 「key」- 结算单明细主键
     */
    public final TableField<FSettlementItemRecord, String> KEY = createField(DSL.name("KEY"), SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 结算单明细主键");
    /**
     * The column <code>DB_ETERNAL.F_SETTLEMENT_ITEM.NAME</code>. 「name」 -  明细名称
     */
    public final TableField<FSettlementItemRecord, String> NAME = createField(DSL.name("NAME"), SQLDataType.VARCHAR(255).nullable(false), this, "「name」 -  明细名称");
    /**
     * The column <code>DB_ETERNAL.F_SETTLEMENT_ITEM.CODE</code>. 「code」 -
     * 明细系统代码
     */
    public final TableField<FSettlementItemRecord, String> CODE = createField(DSL.name("CODE"), SQLDataType.VARCHAR(255).nullable(false), this, "「code」 - 明细系统代码");
    /**
     * The column <code>DB_ETERNAL.F_SETTLEMENT_ITEM.SERIAL</code>. 「serial」 -
     * 明细编号
     */
    public final TableField<FSettlementItemRecord, String> SERIAL = createField(DSL.name("SERIAL"), SQLDataType.VARCHAR(255).nullable(false), this, "「serial」 - 明细编号");
    /**
     * The column <code>DB_ETERNAL.F_SETTLEMENT_ITEM.TYPE</code>. 「type」- 明细类型
     */
    public final TableField<FSettlementItemRecord, String> TYPE = createField(DSL.name("TYPE"), SQLDataType.VARCHAR(36).nullable(false), this, "「type」- 明细类型");
    /**
     * The column <code>DB_ETERNAL.F_SETTLEMENT_ITEM.AMOUNT</code>.
     * 「amount」——价税合计，实际结算金额
     */
    public final TableField<FSettlementItemRecord, BigDecimal> AMOUNT = createField(DSL.name("AMOUNT"), SQLDataType.DECIMAL(18, 2).nullable(false), this, "「amount」——价税合计，实际结算金额");
    /**
     * The column <code>DB_ETERNAL.F_SETTLEMENT_ITEM.COMMENT</code>. 「comment」 -
     * 明细备注
     */
    public final TableField<FSettlementItemRecord, String> COMMENT = createField(DSL.name("COMMENT"), SQLDataType.CLOB, this, "「comment」 - 明细备注");
    /**
     * The column <code>DB_ETERNAL.F_SETTLEMENT_ITEM.MANUAL_NO</code>.
     * 「manualNo」 - 手工单号（线下单号专用）
     */
    public final TableField<FSettlementItemRecord, String> MANUAL_NO = createField(DSL.name("MANUAL_NO"), SQLDataType.VARCHAR(255), this, "「manualNo」 - 手工单号（线下单号专用）");
    /**
     * The column <code>DB_ETERNAL.F_SETTLEMENT_ITEM.PAY_TERM_ID</code>.
     * 「payTermId」- 账单项ID
     */
    public final TableField<FSettlementItemRecord, String> PAY_TERM_ID = createField(DSL.name("PAY_TERM_ID"), SQLDataType.VARCHAR(36).nullable(false), this, "「payTermId」- 账单项ID");
    /**
     * The column <code>DB_ETERNAL.F_SETTLEMENT_ITEM.RELATED_ID</code>.
     * 「relatedId」- 关联BillItem ID（保留，原系统存在）
     */
    public final TableField<FSettlementItemRecord, String> RELATED_ID = createField(DSL.name("RELATED_ID"), SQLDataType.VARCHAR(36), this, "「relatedId」- 关联BillItem ID（保留，原系统存在）");
    /**
     * The column <code>DB_ETERNAL.F_SETTLEMENT_ITEM.SETTLEMENT_ID</code>.
     * 「settlementId」- 结算单ID，该字段有值标识已经结算
     */
    public final TableField<FSettlementItemRecord, String> SETTLEMENT_ID = createField(DSL.name("SETTLEMENT_ID"), SQLDataType.VARCHAR(36), this, "「settlementId」- 结算单ID，该字段有值标识已经结算");
    /**
     * The column <code>DB_ETERNAL.F_SETTLEMENT_ITEM.DEBT_ID</code>. 「debtId」-
     * 应收账单ID
     */
    public final TableField<FSettlementItemRecord, String> DEBT_ID = createField(DSL.name("DEBT_ID"), SQLDataType.VARCHAR(36), this, "「debtId」- 应收账单ID");
    /**
     * The column <code>DB_ETERNAL.F_SETTLEMENT_ITEM.INVOICE_ID</code>.
     * 「invoiceId」- 开票ID
     */
    public final TableField<FSettlementItemRecord, String> INVOICE_ID = createField(DSL.name("INVOICE_ID"), SQLDataType.VARCHAR(36), this, "「invoiceId」- 开票ID");
    /**
     * The column <code>DB_ETERNAL.F_SETTLEMENT_ITEM.SIGMA</code>. 「sigma」- 统一标识
     */
    public final TableField<FSettlementItemRecord, String> SIGMA = createField(DSL.name("SIGMA"), SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识");
    /**
     * The column <code>DB_ETERNAL.F_SETTLEMENT_ITEM.LANGUAGE</code>.
     * 「language」- 使用的语言
     */
    public final TableField<FSettlementItemRecord, String> LANGUAGE = createField(DSL.name("LANGUAGE"), SQLDataType.VARCHAR(10), this, "「language」- 使用的语言");
    /**
     * The column <code>DB_ETERNAL.F_SETTLEMENT_ITEM.ACTIVE</code>. 「active」-
     * 是否启用
     */
    public final TableField<FSettlementItemRecord, Boolean> ACTIVE = createField(DSL.name("ACTIVE"), SQLDataType.BIT, this, "「active」- 是否启用");
    /**
     * The column <code>DB_ETERNAL.F_SETTLEMENT_ITEM.METADATA</code>.
     * 「metadata」- 附加配置数据
     */
    public final TableField<FSettlementItemRecord, String> METADATA = createField(DSL.name("METADATA"), SQLDataType.CLOB, this, "「metadata」- 附加配置数据");
    /**
     * The column <code>DB_ETERNAL.F_SETTLEMENT_ITEM.CREATED_AT</code>.
     * 「createdAt」- 创建时间
     */
    public final TableField<FSettlementItemRecord, LocalDateTime> CREATED_AT = createField(DSL.name("CREATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「createdAt」- 创建时间");
    /**
     * The column <code>DB_ETERNAL.F_SETTLEMENT_ITEM.CREATED_BY</code>.
     * 「createdBy」- 创建人
     */
    public final TableField<FSettlementItemRecord, String> CREATED_BY = createField(DSL.name("CREATED_BY"), SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");
    /**
     * The column <code>DB_ETERNAL.F_SETTLEMENT_ITEM.UPDATED_AT</code>.
     * 「updatedAt」- 更新时间
     */
    public final TableField<FSettlementItemRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("UPDATED_AT"), SQLDataType.LOCALDATETIME(0), this, "「updatedAt」- 更新时间");
    /**
     * The column <code>DB_ETERNAL.F_SETTLEMENT_ITEM.UPDATED_BY</code>.
     * 「updatedBy」- 更新人
     */
    public final TableField<FSettlementItemRecord, String> UPDATED_BY = createField(DSL.name("UPDATED_BY"), SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    private FSettlementItem(Name alias, Table<FSettlementItemRecord> aliased) {
        this(alias, aliased, null);
    }

    private FSettlementItem(Name alias, Table<FSettlementItemRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>DB_ETERNAL.F_SETTLEMENT_ITEM</code> table
     * reference
     */
    public FSettlementItem(String alias) {
        this(DSL.name(alias), F_SETTLEMENT_ITEM);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.F_SETTLEMENT_ITEM</code> table
     * reference
     */
    public FSettlementItem(Name alias) {
        this(alias, F_SETTLEMENT_ITEM);
    }

    /**
     * Create a <code>DB_ETERNAL.F_SETTLEMENT_ITEM</code> table reference
     */
    public FSettlementItem() {
        this(DSL.name("F_SETTLEMENT_ITEM"), null);
    }

    public <O extends Record> FSettlementItem(Table<O> child, ForeignKey<O, FSettlementItemRecord> key) {
        super(child, key, F_SETTLEMENT_ITEM);
    }

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FSettlementItemRecord> getRecordType() {
        return FSettlementItemRecord.class;
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Db.DB_ETERNAL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.F_SETTLEMENT_ITEM_IDX_F_SETTLEMENT_ITEM_DEBT_ID, Indexes.F_SETTLEMENT_ITEM_IDX_F_SETTLEMENT_ITEM_SETTLEMENT_ID);
    }

    @Override
    public UniqueKey<FSettlementItemRecord> getPrimaryKey() {
        return Keys.KEY_F_SETTLEMENT_ITEM_PRIMARY;
    }

    @Override
    public List<UniqueKey<FSettlementItemRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.KEY_F_SETTLEMENT_ITEM_CODE, Keys.KEY_F_SETTLEMENT_ITEM_SERIAL);
    }

    @Override
    public FSettlementItem as(String alias) {
        return new FSettlementItem(DSL.name(alias), this);
    }

    @Override
    public FSettlementItem as(Name alias) {
        return new FSettlementItem(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public FSettlementItem rename(String name) {
        return new FSettlementItem(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FSettlementItem rename(Name name) {
        return new FSettlementItem(name, null);
    }

    // -------------------------------------------------------------------------
    // Row21 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row21<String, String, String, String, String, BigDecimal, String, String, String, String, String, String, String, String, String, Boolean, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row21) super.fieldsRow();
    }
}
