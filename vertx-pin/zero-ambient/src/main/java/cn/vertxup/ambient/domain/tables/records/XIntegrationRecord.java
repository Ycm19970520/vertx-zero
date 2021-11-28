/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables.records;


import cn.vertxup.ambient.domain.tables.XIntegration;
import cn.vertxup.ambient.domain.tables.interfaces.IXIntegration;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XIntegrationRecord extends UpdatableRecordImpl<XIntegrationRecord> implements VertxPojo, IXIntegration {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.KEY</code>. 「key」- 集成配置主键
     */
    @Override
    public XIntegrationRecord setKey(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.KEY</code>. 「key」- 集成配置主键
     */
    @Override
    public String getKey() {
        return (String) get(0);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.NAME</code>. 「name」- 集成名称
     */
    @Override
    public XIntegrationRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.NAME</code>. 「name」- 集成名称
     */
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.TYPE</code>. 「type」- 集成类型
     */
    @Override
    public XIntegrationRecord setType(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.TYPE</code>. 「type」- 集成类型
     */
    @Override
    public String getType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.IP_V4</code>. 「ipV4」- IP v4地址
     */
    @Override
    public XIntegrationRecord setIpV4(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.IP_V4</code>. 「ipV4」- IP v4地址
     */
    @Override
    public String getIpV4() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.IP_V6</code>. 「ipV6」- IP v6地址
     */
    @Override
    public XIntegrationRecord setIpV6(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.IP_V6</code>. 「ipV6」- IP v6地址
     */
    @Override
    public String getIpV6() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.HOSTNAME</code>. 「hostname」-
     * 主机地址
     */
    @Override
    public XIntegrationRecord setHostname(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.HOSTNAME</code>. 「hostname」-
     * 主机地址
     */
    @Override
    public String getHostname() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.PORT</code>. 「port」- 端口号
     */
    @Override
    public XIntegrationRecord setPort(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.PORT</code>. 「port」- 端口号
     */
    @Override
    public Integer getPort() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.PROTOCOL</code>. 「protocol」-
     * 协议类型：HTTP, HTTPS, FTP
     */
    @Override
    public XIntegrationRecord setProtocol(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.PROTOCOL</code>. 「protocol」-
     * 协议类型：HTTP, HTTPS, FTP
     */
    @Override
    public String getProtocol() {
        return (String) get(7);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.ENDPOINT</code>. 「endpoint」-
     * 端地址
     */
    @Override
    public XIntegrationRecord setEndpoint(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.ENDPOINT</code>. 「endpoint」-
     * 端地址
     */
    @Override
    public String getEndpoint() {
        return (String) get(8);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.PATH</code>. 「path」- 集成专用根路径
     */
    @Override
    public XIntegrationRecord setPath(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.PATH</code>. 「path」- 集成专用根路径
     */
    @Override
    public String getPath() {
        return (String) get(9);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.OS_KEY</code>. 「osKey」- 开源专用Key
     */
    @Override
    public XIntegrationRecord setOsKey(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.OS_KEY</code>. 「osKey」- 开源专用Key
     */
    @Override
    public String getOsKey() {
        return (String) get(10);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.OS_SECRET</code>. 「osSecret」-
     * 开源专用Secret
     */
    @Override
    public XIntegrationRecord setOsSecret(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.OS_SECRET</code>. 「osSecret」-
     * 开源专用Secret
     */
    @Override
    public String getOsSecret() {
        return (String) get(11);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.OS_AUTHORIZE</code>.
     * 「osAuthorize」- Authorize接口
     */
    @Override
    public XIntegrationRecord setOsAuthorize(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.OS_AUTHORIZE</code>.
     * 「osAuthorize」- Authorize接口
     */
    @Override
    public String getOsAuthorize() {
        return (String) get(12);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.OS_TOKEN</code>. 「osToken」-
     * Token接口
     */
    @Override
    public XIntegrationRecord setOsToken(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.OS_TOKEN</code>. 「osToken」-
     * Token接口
     */
    @Override
    public String getOsToken() {
        return (String) get(13);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.USERNAME</code>. 「username」- 账号
     */
    @Override
    public XIntegrationRecord setUsername(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.USERNAME</code>. 「username」- 账号
     */
    @Override
    public String getUsername() {
        return (String) get(14);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.PASSWORD</code>. 「password」- 密码
     */
    @Override
    public XIntegrationRecord setPassword(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.PASSWORD</code>. 「password」- 密码
     */
    @Override
    public String getPassword() {
        return (String) get(15);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.PUBLIC_KEY</code>. 「publicKey」-
     * Key文件
     */
    @Override
    public XIntegrationRecord setPublicKey(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.PUBLIC_KEY</code>. 「publicKey」-
     * Key文件
     */
    @Override
    public String getPublicKey() {
        return (String) get(16);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.OPTIONS</code>. 「options」-
     * 集成相关配置
     */
    @Override
    public XIntegrationRecord setOptions(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.OPTIONS</code>. 「options」-
     * 集成相关配置
     */
    @Override
    public String getOptions() {
        return (String) get(17);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.APP_ID</code>. 「appId」-
     * 关联的应用程序ID
     */
    @Override
    public XIntegrationRecord setAppId(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.APP_ID</code>. 「appId」-
     * 关联的应用程序ID
     */
    @Override
    public String getAppId() {
        return (String) get(18);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public XIntegrationRecord setActive(Boolean value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return (Boolean) get(19);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public XIntegrationRecord setSigma(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return (String) get(20);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.METADATA</code>. 「metadata」-
     * 附加配置
     */
    @Override
    public XIntegrationRecord setMetadata(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.METADATA</code>. 「metadata」-
     * 附加配置
     */
    @Override
    public String getMetadata() {
        return (String) get(21);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.LANGUAGE</code>. 「language」-
     * 使用的语言
     */
    @Override
    public XIntegrationRecord setLanguage(String value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.LANGUAGE</code>. 「language」-
     * 使用的语言
     */
    @Override
    public String getLanguage() {
        return (String) get(22);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public XIntegrationRecord setCreatedAt(LocalDateTime value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(23);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    @Override
    public XIntegrationRecord setCreatedBy(String value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    @Override
    public String getCreatedBy() {
        return (String) get(24);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public XIntegrationRecord setUpdatedAt(LocalDateTime value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(25);
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    @Override
    public XIntegrationRecord setUpdatedBy(String value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    @Override
    public String getUpdatedBy() {
        return (String) get(26);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IXIntegration from) {
        setKey(from.getKey());
        setName(from.getName());
        setType(from.getType());
        setIpV4(from.getIpV4());
        setIpV6(from.getIpV6());
        setHostname(from.getHostname());
        setPort(from.getPort());
        setProtocol(from.getProtocol());
        setEndpoint(from.getEndpoint());
        setPath(from.getPath());
        setOsKey(from.getOsKey());
        setOsSecret(from.getOsSecret());
        setOsAuthorize(from.getOsAuthorize());
        setOsToken(from.getOsToken());
        setUsername(from.getUsername());
        setPassword(from.getPassword());
        setPublicKey(from.getPublicKey());
        setOptions(from.getOptions());
        setAppId(from.getAppId());
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
    public <E extends IXIntegration> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached XIntegrationRecord
     */
    public XIntegrationRecord() {
        super(XIntegration.X_INTEGRATION);
    }

    /**
     * Create a detached, initialised XIntegrationRecord
     */
    public XIntegrationRecord(String key, String name, String type, String ipV4, String ipV6, String hostname, Integer port, String protocol, String endpoint, String path, String osKey, String osSecret, String osAuthorize, String osToken, String username, String password, String publicKey, String options, String appId, Boolean active, String sigma, String metadata, String language, LocalDateTime createdAt, String createdBy, LocalDateTime updatedAt, String updatedBy) {
        super(XIntegration.X_INTEGRATION);

        setKey(key);
        setName(name);
        setType(type);
        setIpV4(ipV4);
        setIpV6(ipV6);
        setHostname(hostname);
        setPort(port);
        setProtocol(protocol);
        setEndpoint(endpoint);
        setPath(path);
        setOsKey(osKey);
        setOsSecret(osSecret);
        setOsAuthorize(osAuthorize);
        setOsToken(osToken);
        setUsername(username);
        setPassword(password);
        setPublicKey(publicKey);
        setOptions(options);
        setAppId(appId);
        setActive(active);
        setSigma(sigma);
        setMetadata(metadata);
        setLanguage(language);
        setCreatedAt(createdAt);
        setCreatedBy(createdBy);
        setUpdatedAt(updatedAt);
        setUpdatedBy(updatedBy);
    }

    /**
     * Create a detached, initialised XIntegrationRecord
     */
    public XIntegrationRecord(cn.vertxup.ambient.domain.tables.pojos.XIntegration value) {
        super(XIntegration.X_INTEGRATION);

        if (value != null) {
            setKey(value.getKey());
            setName(value.getName());
            setType(value.getType());
            setIpV4(value.getIpV4());
            setIpV6(value.getIpV6());
            setHostname(value.getHostname());
            setPort(value.getPort());
            setProtocol(value.getProtocol());
            setEndpoint(value.getEndpoint());
            setPath(value.getPath());
            setOsKey(value.getOsKey());
            setOsSecret(value.getOsSecret());
            setOsAuthorize(value.getOsAuthorize());
            setOsToken(value.getOsToken());
            setUsername(value.getUsername());
            setPassword(value.getPassword());
            setPublicKey(value.getPublicKey());
            setOptions(value.getOptions());
            setAppId(value.getAppId());
            setActive(value.getActive());
            setSigma(value.getSigma());
            setMetadata(value.getMetadata());
            setLanguage(value.getLanguage());
            setCreatedAt(value.getCreatedAt());
            setCreatedBy(value.getCreatedBy());
            setUpdatedAt(value.getUpdatedAt());
            setUpdatedBy(value.getUpdatedBy());
        }
    }

        public XIntegrationRecord(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }
}