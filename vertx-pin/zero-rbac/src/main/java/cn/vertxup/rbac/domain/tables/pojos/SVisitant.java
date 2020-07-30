/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.rbac.domain.tables.pojos;


import cn.vertxup.rbac.domain.tables.interfaces.ISVisitant;

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
public class SVisitant implements ISVisitant {

    private static final long serialVersionUID = -732526774;

    private String        key;
    private String        viewId;
    private String        type;
    private String        staticKey;
    private String        dynamicId;
    private String        relatedId;
    private String        relatedResource;
    private String        relatedConfig;
    private String        aclVisible;
    private String        aclView;
    private String        aclVariety;
    private String        aclVarietyConfig;
    private String        aclVow;
    private String        aclVowConfig;
    private String        aclDepend;
    private String        aclDependConfig;
    private String        sigma;
    private String        language;
    private Boolean       active;
    private String        metadata;
    private LocalDateTime createdAt;
    private String        createdBy;
    private LocalDateTime updatedAt;
    private String        updatedBy;

    public SVisitant() {}

    public SVisitant(SVisitant value) {
        this.key = value.key;
        this.viewId = value.viewId;
        this.type = value.type;
        this.staticKey = value.staticKey;
        this.dynamicId = value.dynamicId;
        this.relatedId = value.relatedId;
        this.relatedResource = value.relatedResource;
        this.relatedConfig = value.relatedConfig;
        this.aclVisible = value.aclVisible;
        this.aclView = value.aclView;
        this.aclVariety = value.aclVariety;
        this.aclVarietyConfig = value.aclVarietyConfig;
        this.aclVow = value.aclVow;
        this.aclVowConfig = value.aclVowConfig;
        this.aclDepend = value.aclDepend;
        this.aclDependConfig = value.aclDependConfig;
        this.sigma = value.sigma;
        this.language = value.language;
        this.active = value.active;
        this.metadata = value.metadata;
        this.createdAt = value.createdAt;
        this.createdBy = value.createdBy;
        this.updatedAt = value.updatedAt;
        this.updatedBy = value.updatedBy;
    }

    public SVisitant(
        String        key,
        String        viewId,
        String        type,
        String        staticKey,
        String        dynamicId,
        String        relatedId,
        String        relatedResource,
        String        relatedConfig,
        String        aclVisible,
        String        aclView,
        String        aclVariety,
        String        aclVarietyConfig,
        String        aclVow,
        String        aclVowConfig,
        String        aclDepend,
        String        aclDependConfig,
        String        sigma,
        String        language,
        Boolean       active,
        String        metadata,
        LocalDateTime createdAt,
        String        createdBy,
        LocalDateTime updatedAt,
        String        updatedBy
    ) {
        this.key = key;
        this.viewId = viewId;
        this.type = type;
        this.staticKey = staticKey;
        this.dynamicId = dynamicId;
        this.relatedId = relatedId;
        this.relatedResource = relatedResource;
        this.relatedConfig = relatedConfig;
        this.aclVisible = aclVisible;
        this.aclView = aclView;
        this.aclVariety = aclVariety;
        this.aclVarietyConfig = aclVarietyConfig;
        this.aclVow = aclVow;
        this.aclVowConfig = aclVowConfig;
        this.aclDepend = aclDepend;
        this.aclDependConfig = aclDependConfig;
        this.sigma = sigma;
        this.language = language;
        this.active = active;
        this.metadata = metadata;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

    @Override
    public String getKey() {
        return this.key;
    }

    @Override
    public SVisitant setKey(String key) {
        this.key = key;
        return this;
    }

    @Override
    public String getViewId() {
        return this.viewId;
    }

    @Override
    public SVisitant setViewId(String viewId) {
        this.viewId = viewId;
        return this;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public SVisitant setType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public String getStaticKey() {
        return this.staticKey;
    }

    @Override
    public SVisitant setStaticKey(String staticKey) {
        this.staticKey = staticKey;
        return this;
    }

    @Override
    public String getDynamicId() {
        return this.dynamicId;
    }

    @Override
    public SVisitant setDynamicId(String dynamicId) {
        this.dynamicId = dynamicId;
        return this;
    }

    @Override
    public String getRelatedId() {
        return this.relatedId;
    }

    @Override
    public SVisitant setRelatedId(String relatedId) {
        this.relatedId = relatedId;
        return this;
    }

    @Override
    public String getRelatedResource() {
        return this.relatedResource;
    }

    @Override
    public SVisitant setRelatedResource(String relatedResource) {
        this.relatedResource = relatedResource;
        return this;
    }

    @Override
    public String getRelatedConfig() {
        return this.relatedConfig;
    }

    @Override
    public SVisitant setRelatedConfig(String relatedConfig) {
        this.relatedConfig = relatedConfig;
        return this;
    }

    @Override
    public String getAclVisible() {
        return this.aclVisible;
    }

    @Override
    public SVisitant setAclVisible(String aclVisible) {
        this.aclVisible = aclVisible;
        return this;
    }

    @Override
    public String getAclView() {
        return this.aclView;
    }

    @Override
    public SVisitant setAclView(String aclView) {
        this.aclView = aclView;
        return this;
    }

    @Override
    public String getAclVariety() {
        return this.aclVariety;
    }

    @Override
    public SVisitant setAclVariety(String aclVariety) {
        this.aclVariety = aclVariety;
        return this;
    }

    @Override
    public String getAclVarietyConfig() {
        return this.aclVarietyConfig;
    }

    @Override
    public SVisitant setAclVarietyConfig(String aclVarietyConfig) {
        this.aclVarietyConfig = aclVarietyConfig;
        return this;
    }

    @Override
    public String getAclVow() {
        return this.aclVow;
    }

    @Override
    public SVisitant setAclVow(String aclVow) {
        this.aclVow = aclVow;
        return this;
    }

    @Override
    public String getAclVowConfig() {
        return this.aclVowConfig;
    }

    @Override
    public SVisitant setAclVowConfig(String aclVowConfig) {
        this.aclVowConfig = aclVowConfig;
        return this;
    }

    @Override
    public String getAclDepend() {
        return this.aclDepend;
    }

    @Override
    public SVisitant setAclDepend(String aclDepend) {
        this.aclDepend = aclDepend;
        return this;
    }

    @Override
    public String getAclDependConfig() {
        return this.aclDependConfig;
    }

    @Override
    public SVisitant setAclDependConfig(String aclDependConfig) {
        this.aclDependConfig = aclDependConfig;
        return this;
    }

    @Override
    public String getSigma() {
        return this.sigma;
    }

    @Override
    public SVisitant setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    @Override
    public String getLanguage() {
        return this.language;
    }

    @Override
    public SVisitant setLanguage(String language) {
        this.language = language;
        return this;
    }

    @Override
    public Boolean getActive() {
        return this.active;
    }

    @Override
    public SVisitant setActive(Boolean active) {
        this.active = active;
        return this;
    }

    @Override
    public String getMetadata() {
        return this.metadata;
    }

    @Override
    public SVisitant setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    @Override
    public SVisitant setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    @Override
    public SVisitant setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    @Override
    public SVisitant setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    @Override
    public SVisitant setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SVisitant (");

        sb.append(key);
        sb.append(", ").append(viewId);
        sb.append(", ").append(type);
        sb.append(", ").append(staticKey);
        sb.append(", ").append(dynamicId);
        sb.append(", ").append(relatedId);
        sb.append(", ").append(relatedResource);
        sb.append(", ").append(relatedConfig);
        sb.append(", ").append(aclVisible);
        sb.append(", ").append(aclView);
        sb.append(", ").append(aclVariety);
        sb.append(", ").append(aclVarietyConfig);
        sb.append(", ").append(aclVow);
        sb.append(", ").append(aclVowConfig);
        sb.append(", ").append(aclDepend);
        sb.append(", ").append(aclDependConfig);
        sb.append(", ").append(sigma);
        sb.append(", ").append(language);
        sb.append(", ").append(active);
        sb.append(", ").append(metadata);
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

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ISVisitant from) {
        setKey(from.getKey());
        setViewId(from.getViewId());
        setType(from.getType());
        setStaticKey(from.getStaticKey());
        setDynamicId(from.getDynamicId());
        setRelatedId(from.getRelatedId());
        setRelatedResource(from.getRelatedResource());
        setRelatedConfig(from.getRelatedConfig());
        setAclVisible(from.getAclVisible());
        setAclView(from.getAclView());
        setAclVariety(from.getAclVariety());
        setAclVarietyConfig(from.getAclVarietyConfig());
        setAclVow(from.getAclVow());
        setAclVowConfig(from.getAclVowConfig());
        setAclDepend(from.getAclDepend());
        setAclDependConfig(from.getAclDependConfig());
        setSigma(from.getSigma());
        setLanguage(from.getLanguage());
        setActive(from.getActive());
        setMetadata(from.getMetadata());
        setCreatedAt(from.getCreatedAt());
        setCreatedBy(from.getCreatedBy());
        setUpdatedAt(from.getUpdatedAt());
        setUpdatedBy(from.getUpdatedBy());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ISVisitant> E into(E into) {
        into.from(this);
        return into;
    }

    public SVisitant(io.vertx.core.json.JsonObject json) {
        fromJson(json);
    }
}
