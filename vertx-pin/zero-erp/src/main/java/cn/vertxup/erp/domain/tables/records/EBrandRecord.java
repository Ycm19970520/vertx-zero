/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.erp.domain.tables.records;


import cn.vertxup.erp.domain.tables.EBrand;
import cn.vertxup.erp.domain.tables.interfaces.IEBrand;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EBrandRecord extends UpdatableRecordImpl<EBrandRecord> implements VertxPojo, Record18<String, String, String, String, String, String, String, String, String, String, String, Boolean, String, String, LocalDateTime, String, LocalDateTime, String>, IEBrand {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DB_ETERNAL.E_BRAND.KEY</code>. 「key」- 品牌ID
     */
    @Override
    public EBrandRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_BRAND.KEY</code>. 「key」- 品牌ID
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_BRAND.CODE</code>. 「code」- 品牌编码
     */
    @Override
    public EBrandRecord setCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_BRAND.CODE</code>. 「code」- 品牌编码
     */
    @Override
    public String getCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_BRAND.NAME</code>. 「name」- 品牌名称
     */
    @Override
    public EBrandRecord setName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_BRAND.NAME</code>. 「name」- 品牌名称
     */
    @Override
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_BRAND.ALIAS</code>. 「alias」- 品牌别名
     */
    @Override
    public EBrandRecord setAlias(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_BRAND.ALIAS</code>. 「alias」- 品牌别名
     */
    @Override
    public String getAlias() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_BRAND.COMPANY_NAME</code>. 「companyName」-
     * 品牌公司名
     */
    @Override
    public EBrandRecord setCompanyName(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_BRAND.COMPANY_NAME</code>. 「companyName」-
     * 品牌公司名
     */
    @Override
    public String getCompanyName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_BRAND.CATEGORY_CODE</code>. 「categoryCode」-
     * 类别代码
     */
    @Override
    public EBrandRecord setCategoryCode(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_BRAND.CATEGORY_CODE</code>. 「categoryCode」-
     * 类别代码
     */
    @Override
    public String getCategoryCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_BRAND.CATEGORY_NAME</code>. 「categoryName」-
     * 类别名称
     */
    @Override
    public EBrandRecord setCategoryName(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_BRAND.CATEGORY_NAME</code>. 「categoryName」-
     * 类别名称
     */
    @Override
    public String getCategoryName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_BRAND.AREA</code>. 「area」-
     * GB/T2659-2000国际标准区域码
     */
    @Override
    public EBrandRecord setArea(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_BRAND.AREA</code>. 「area」-
     * GB/T2659-2000国际标准区域码
     */
    @Override
    public String getArea() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_BRAND.AREA_NAME</code>. 「areaName」- 区域名称
     */
    @Override
    public EBrandRecord setAreaName(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_BRAND.AREA_NAME</code>. 「areaName」- 区域名称
     */
    @Override
    public String getAreaName() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_BRAND.AREA_CATEGORY</code>. 「areaCategory」-
     * 区域类别码
     */
    @Override
    public EBrandRecord setAreaCategory(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_BRAND.AREA_CATEGORY</code>. 「areaCategory」-
     * 区域类别码
     */
    @Override
    public String getAreaCategory() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_BRAND.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public EBrandRecord setMetadata(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_BRAND.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_BRAND.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public EBrandRecord setActive(Boolean value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_BRAND.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_BRAND.SIGMA</code>. 「sigma」- 统一标识（公司所属应用）
     */
    @Override
    public EBrandRecord setSigma(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_BRAND.SIGMA</code>. 「sigma」- 统一标识（公司所属应用）
     */
    @Override
    public String getSigma() {
        return (String) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_BRAND.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public EBrandRecord setLanguage(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_BRAND.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_BRAND.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public EBrandRecord setCreatedAt(LocalDateTime value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_BRAND.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_BRAND.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public EBrandRecord setCreatedBy(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_BRAND.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_BRAND.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public EBrandRecord setUpdatedAt(LocalDateTime value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_BRAND.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(16);
    }

    /**
     * Setter for <code>DB_ETERNAL.E_BRAND.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public EBrandRecord setUpdatedBy(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.E_BRAND.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(17);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record18 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row18<String, String, String, String, String, String, String, String, String, String, String, Boolean, String, String, LocalDateTime, String, LocalDateTime, String> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    @Override
    public Row18<String, String, String, String, String, String, String, String, String, String, String, Boolean, String, String, LocalDateTime, String, LocalDateTime, String> valuesRow() {
        return (Row18) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return EBrand.E_BRAND.KEY;
    }

    @Override
    public Field<String> field2() {
        return EBrand.E_BRAND.CODE;
    }

    @Override
    public Field<String> field3() {
        return EBrand.E_BRAND.NAME;
    }

    @Override
    public Field<String> field4() {
        return EBrand.E_BRAND.ALIAS;
    }

    @Override
    public Field<String> field5() {
        return EBrand.E_BRAND.COMPANY_NAME;
    }

    @Override
    public Field<String> field6() {
        return EBrand.E_BRAND.CATEGORY_CODE;
    }

    @Override
    public Field<String> field7() {
        return EBrand.E_BRAND.CATEGORY_NAME;
    }

    @Override
    public Field<String> field8() {
        return EBrand.E_BRAND.AREA;
    }

    @Override
    public Field<String> field9() {
        return EBrand.E_BRAND.AREA_NAME;
    }

    @Override
    public Field<String> field10() {
        return EBrand.E_BRAND.AREA_CATEGORY;
    }

    @Override
    public Field<String> field11() {
        return EBrand.E_BRAND.METADATA;
    }

    @Override
    public Field<Boolean> field12() {
        return EBrand.E_BRAND.ACTIVE;
    }

    @Override
    public Field<String> field13() {
        return EBrand.E_BRAND.SIGMA;
    }

    @Override
    public Field<String> field14() {
        return EBrand.E_BRAND.LANGUAGE;
    }

    @Override
    public Field<LocalDateTime> field15() {
        return EBrand.E_BRAND.CREATED_AT;
    }

    @Override
    public Field<String> field16() {
        return EBrand.E_BRAND.CREATED_BY;
    }

    @Override
    public Field<LocalDateTime> field17() {
        return EBrand.E_BRAND.UPDATED_AT;
    }

    @Override
    public Field<String> field18() {
        return EBrand.E_BRAND.UPDATED_BY;
    }

    @Override
    public String component1() {
        return getKey();
    }

    @Override
    public String component2() {
        return getCode();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public String component4() {
        return getAlias();
    }

    @Override
    public String component5() {
        return getCompanyName();
    }

    @Override
    public String component6() {
        return getCategoryCode();
    }

    @Override
    public String component7() {
        return getCategoryName();
    }

    @Override
    public String component8() {
        return getArea();
    }

    @Override
    public String component9() {
        return getAreaName();
    }

    @Override
    public String component10() {
        return getAreaCategory();
    }

    @Override
    public String component11() {
        return getMetadata();
    }

    @Override
    public Boolean component12() {
        return getActive();
    }

    @Override
    public String component13() {
        return getSigma();
    }

    @Override
    public String component14() {
        return getLanguage();
    }

    @Override
    public LocalDateTime component15() {
        return getCreatedAt();
    }

    @Override
    public String component16() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime component17() {
        return getUpdatedAt();
    }

    @Override
    public String component18() {
        return getUpdatedBy();
    }

    @Override
    public String value1() {
        return getKey();
    }

    @Override
    public String value2() {
        return getCode();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public String value4() {
        return getAlias();
    }

    @Override
    public String value5() {
        return getCompanyName();
    }

    @Override
    public String value6() {
        return getCategoryCode();
    }

    @Override
    public String value7() {
        return getCategoryName();
    }

    @Override
    public String value8() {
        return getArea();
    }

    @Override
    public String value9() {
        return getAreaName();
    }

    @Override
    public String value10() {
        return getAreaCategory();
    }

    @Override
    public String value11() {
        return getMetadata();
    }

    @Override
    public Boolean value12() {
        return getActive();
    }

    @Override
    public String value13() {
        return getSigma();
    }

    @Override
    public String value14() {
        return getLanguage();
    }

    @Override
    public LocalDateTime value15() {
        return getCreatedAt();
    }

    @Override
    public String value16() {
        return getCreatedBy();
    }

    @Override
    public LocalDateTime value17() {
        return getUpdatedAt();
    }

    @Override
    public String value18() {
        return getUpdatedBy();
    }

    @Override
    public EBrandRecord value1(String value) {
        setKey(value);
        return this;
    }

    @Override
    public EBrandRecord value2(String value) {
        setCode(value);
        return this;
    }

    @Override
    public EBrandRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public EBrandRecord value4(String value) {
        setAlias(value);
        return this;
    }

    @Override
    public EBrandRecord value5(String value) {
        setCompanyName(value);
        return this;
    }

    @Override
    public EBrandRecord value6(String value) {
        setCategoryCode(value);
        return this;
    }

    @Override
    public EBrandRecord value7(String value) {
        setCategoryName(value);
        return this;
    }

    @Override
    public EBrandRecord value8(String value) {
        setArea(value);
        return this;
    }

    @Override
    public EBrandRecord value9(String value) {
        setAreaName(value);
        return this;
    }

    @Override
    public EBrandRecord value10(String value) {
        setAreaCategory(value);
        return this;
    }

    @Override
    public EBrandRecord value11(String value) {
        setMetadata(value);
        return this;
    }

    @Override
    public EBrandRecord value12(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public EBrandRecord value13(String value) {
        setSigma(value);
        return this;
    }

    @Override
    public EBrandRecord value14(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public EBrandRecord value15(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public EBrandRecord value16(String value) {
        setCreatedBy(value);
        return this;
    }

    @Override
    public EBrandRecord value17(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public EBrandRecord value18(String value) {
        setUpdatedBy(value);
        return this;
    }

    @Override
    public EBrandRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, Boolean value12, String value13, String value14, LocalDateTime value15, String value16, LocalDateTime value17, String value18) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IEBrand from) {
        setKey(from.getKey());
        setCode(from.getCode());
        setName(from.getName());
        setAlias(from.getAlias());
        setCompanyName(from.getCompanyName());
        setCategoryCode(from.getCategoryCode());
        setCategoryName(from.getCategoryName());
        setArea(from.getArea());
        setAreaName(from.getAreaName());
        setAreaCategory(from.getAreaCategory());
        setMetadata(from.getMetadata());
        setActive(from.getActive());
        setSigma(from.getSigma());
        setLanguage(from.getLanguage());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    @Override
    public <E extends IEBrand> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EBrandRecord
     */
    public EBrandRecord() {
        super(EBrand.E_BRAND);
    }

    /**
     * Create a detached, initialised EBrandRecord
     */
    public EBrandRecord(String key, String code, String name, String alias, String companyName, String categoryCode, String categoryName, String area, String areaName, String areaCategory, String metadata, Boolean active, String sigma, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(EBrand.E_BRAND);

        setKey(key);
        setCode(code);
        setName(name);
        setAlias(alias);
        setCompanyName(companyName);
        setCategoryCode(categoryCode);
        setCategoryName(categoryName);
        setArea(area);
        setAreaName(areaName);
        setAreaCategory(areaCategory);
        setMetadata(metadata);
        setActive(active);
        setSigma(sigma);
        setLanguage(language);
        setCreatedAt(createdAt);
        setCreatedBy(createdBy);
        setUpdatedAt(updatedAt);
        setUpdatedBy(updatedBy);
    }

    /**
     * Create a detached, initialised EBrandRecord
     */
    public EBrandRecord(cn.vertxup.erp.domain.tables.pojos.EBrand value) {
        super(EBrand.E_BRAND);

        if (value != null) {
            setKey(value.getKey());
            setCode(value.getCode());
            setName(value.getName());
            setAlias(value.getAlias());
            setCompanyName(value.getCompanyName());
            setCategoryCode(value.getCategoryCode());
            setCategoryName(value.getCategoryName());
            setArea(value.getArea());
            setAreaName(value.getAreaName());
            setAreaCategory(value.getAreaCategory());
            setMetadata(value.getMetadata());
            setActive(value.getActive());
            setSigma(value.getSigma());
            setLanguage(value.getLanguage());
            setCreatedAt(value.getCreatedAt());
            setCreatedBy(value.getCreatedBy());
            setUpdatedAt(value.getUpdatedAt());
            setUpdatedBy(value.getUpdatedBy());
        }
    }

        public EBrandRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}
