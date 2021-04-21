/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables;


import cn.vertxup.erp.domain.Db;
import cn.vertxup.erp.domain.Indexes;
import cn.vertxup.erp.domain.Keys;
import cn.vertxup.erp.domain.tables.records.EBrandRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


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
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class EBrand extends TableImpl<EBrandRecord> {

    private static final long serialVersionUID = -329857806;

    /**
     * The reference instance of <code>DB_ETERNAL.E_BRAND</code>
     */
    public static final EBrand E_BRAND = new EBrand();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EBrandRecord> getRecordType() {
        return EBrandRecord.class;
    }

    /**
     * The column <code>DB_ETERNAL.E_BRAND.KEY</code>. 「key」- 品牌ID
     */
    public final TableField<EBrandRecord, String> KEY = createField("KEY", org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "「key」- 品牌ID");

    /**
     * The column <code>DB_ETERNAL.E_BRAND.CODE</code>. 「code」- 品牌编码
     */
    public final TableField<EBrandRecord, String> CODE = createField("CODE", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「code」- 品牌编码");

    /**
     * The column <code>DB_ETERNAL.E_BRAND.NAME</code>. 「name」- 品牌名称
     */
    public final TableField<EBrandRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「name」- 品牌名称");

    /**
     * The column <code>DB_ETERNAL.E_BRAND.ALIAS</code>. 「alias」- 品牌别名
     */
    public final TableField<EBrandRecord, String> ALIAS = createField("ALIAS", org.jooq.impl.SQLDataType.VARCHAR(255), this, "「alias」- 品牌别名");

    /**
     * The column <code>DB_ETERNAL.E_BRAND.COMPANY_NAME</code>. 「companyName」- 品牌公司名
     */
    public final TableField<EBrandRecord, String> COMPANY_NAME = createField("COMPANY_NAME", org.jooq.impl.SQLDataType.VARCHAR(128), this, "「companyName」- 品牌公司名");

    /**
     * The column <code>DB_ETERNAL.E_BRAND.CATEGORY_CODE</code>. 「categoryCode」- 类别代码
     */
    public final TableField<EBrandRecord, String> CATEGORY_CODE = createField("CATEGORY_CODE", org.jooq.impl.SQLDataType.VARCHAR(16), this, "「categoryCode」- 类别代码");

    /**
     * The column <code>DB_ETERNAL.E_BRAND.CATEGORY_NAME</code>. 「categoryName」- 类别名称
     */
    public final TableField<EBrandRecord, String> CATEGORY_NAME = createField("CATEGORY_NAME", org.jooq.impl.SQLDataType.VARCHAR(128), this, "「categoryName」- 类别名称");

    /**
     * The column <code>DB_ETERNAL.E_BRAND.AREA</code>. 「area」- GB/T2659-2000国际标准区域码
     */
    public final TableField<EBrandRecord, Integer> AREA = createField("AREA", org.jooq.impl.SQLDataType.INTEGER, this, "「area」- GB/T2659-2000国际标准区域码");

    /**
     * The column <code>DB_ETERNAL.E_BRAND.AREA_NAME</code>. 「areaName」- 区域名称
     */
    public final TableField<EBrandRecord, String> AREA_NAME = createField("AREA_NAME", org.jooq.impl.SQLDataType.VARCHAR(128), this, "「areaName」- 区域名称");

    /**
     * The column <code>DB_ETERNAL.E_BRAND.AREA_CATEGORY</code>. 「areaCategory」- 区域类别码
     */
    public final TableField<EBrandRecord, String> AREA_CATEGORY = createField("AREA_CATEGORY", org.jooq.impl.SQLDataType.VARCHAR(16), this, "「areaCategory」- 区域类别码");

    /**
     * The column <code>DB_ETERNAL.E_BRAND.METADATA</code>. 「metadata」- 附加配置
     */
    public final TableField<EBrandRecord, String> METADATA = createField("METADATA", org.jooq.impl.SQLDataType.CLOB, this, "「metadata」- 附加配置");

    /**
     * The column <code>DB_ETERNAL.E_BRAND.ACTIVE</code>. 「active」- 是否启用
     */
    public final TableField<EBrandRecord, Boolean> ACTIVE = createField("ACTIVE", org.jooq.impl.SQLDataType.BIT, this, "「active」- 是否启用");

    /**
     * The column <code>DB_ETERNAL.E_BRAND.SIGMA</code>. 「sigma」- 统一标识（公司所属应用）
     */
    public final TableField<EBrandRecord, String> SIGMA = createField("SIGMA", org.jooq.impl.SQLDataType.VARCHAR(32), this, "「sigma」- 统一标识（公司所属应用）");

    /**
     * The column <code>DB_ETERNAL.E_BRAND.LANGUAGE</code>. 「language」- 使用的语言
     */
    public final TableField<EBrandRecord, String> LANGUAGE = createField("LANGUAGE", org.jooq.impl.SQLDataType.VARCHAR(8), this, "「language」- 使用的语言");

    /**
     * The column <code>DB_ETERNAL.E_BRAND.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    public final TableField<EBrandRecord, LocalDateTime> CREATED_AT = createField("CREATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「createdAt」- 创建时间");

    /**
     * The column <code>DB_ETERNAL.E_BRAND.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public final TableField<EBrandRecord, String> CREATED_BY = createField("CREATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「createdBy」- 创建人");

    /**
     * The column <code>DB_ETERNAL.E_BRAND.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    public final TableField<EBrandRecord, LocalDateTime> UPDATED_AT = createField("UPDATED_AT", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "「updatedAt」- 更新时间");

    /**
     * The column <code>DB_ETERNAL.E_BRAND.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public final TableField<EBrandRecord, String> UPDATED_BY = createField("UPDATED_BY", org.jooq.impl.SQLDataType.VARCHAR(36), this, "「updatedBy」- 更新人");

    /**
     * Create a <code>DB_ETERNAL.E_BRAND</code> table reference
     */
    public EBrand() {
        this(DSL.name("E_BRAND"), null);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.E_BRAND</code> table reference
     */
    public EBrand(String alias) {
        this(DSL.name(alias), E_BRAND);
    }

    /**
     * Create an aliased <code>DB_ETERNAL.E_BRAND</code> table reference
     */
    public EBrand(Name alias) {
        this(alias, E_BRAND);
    }

    private EBrand(Name alias, Table<EBrandRecord> aliased) {
        this(alias, aliased, null);
    }

    private EBrand(Name alias, Table<EBrandRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Db.DB_ETERNAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.E_BRAND_ALIAS, Indexes.E_BRAND_CODE, Indexes.E_BRAND_NAME, Indexes.E_BRAND_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EBrandRecord> getPrimaryKey() {
        return Keys.KEY_E_BRAND_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EBrandRecord>> getKeys() {
        return Arrays.<UniqueKey<EBrandRecord>>asList(Keys.KEY_E_BRAND_PRIMARY, Keys.KEY_E_BRAND_CODE, Keys.KEY_E_BRAND_NAME, Keys.KEY_E_BRAND_ALIAS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EBrand as(String alias) {
        return new EBrand(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EBrand as(Name alias) {
        return new EBrand(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public EBrand rename(String name) {
        return new EBrand(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public EBrand rename(Name name) {
        return new EBrand(name, null);
    }
}
