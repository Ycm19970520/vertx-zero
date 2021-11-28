/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables.pojos;


import cn.vertxup.ambient.domain.tables.interfaces.IXIntegration;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XIntegration implements VertxPojo, IXIntegration {

    private static final long serialVersionUID = 1L;

    private String        key;
    private String        name;
    private String        type;
    private String        ipV4;
    private String        ipV6;
    private String        hostname;
    private Integer       port;
    private String        protocol;
    private String        endpoint;
    private String        path;
    private String        osKey;
    private String        osSecret;
    private String        osAuthorize;
    private String        osToken;
    private String        username;
    private String        password;
    private String        publicKey;
    private String        options;
    private String        appId;
    private Boolean       active;
    private String        sigma;
    private String        metadata;
    private String        language;
    private LocalDateTime createdAt;
    private String        createdBy;
    private LocalDateTime updatedAt;
    private String        updatedBy;

    public XIntegration() {}

    public XIntegration(IXIntegration value) {
        this.key = value.getKey();
        this.name = value.getName();
        this.type = value.getType();
        this.ipV4 = value.getIpV4();
        this.ipV6 = value.getIpV6();
        this.hostname = value.getHostname();
        this.port = value.getPort();
        this.protocol = value.getProtocol();
        this.endpoint = value.getEndpoint();
        this.path = value.getPath();
        this.osKey = value.getOsKey();
        this.osSecret = value.getOsSecret();
        this.osAuthorize = value.getOsAuthorize();
        this.osToken = value.getOsToken();
        this.username = value.getUsername();
        this.password = value.getPassword();
        this.publicKey = value.getPublicKey();
        this.options = value.getOptions();
        this.appId = value.getAppId();
        this.active = value.getActive();
        this.sigma = value.getSigma();
        this.metadata = value.getMetadata();
        this.language = value.getLanguage();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public XIntegration(
        String        key,
        String        name,
        String        type,
        String        ipV4,
        String        ipV6,
        String        hostname,
        Integer       port,
        String        protocol,
        String        endpoint,
        String        path,
        String        osKey,
        String        osSecret,
        String        osAuthorize,
        String        osToken,
        String        username,
        String        password,
        String        publicKey,
        String        options,
        String        appId,
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
        this.name = name;
        this.type = type;
        this.ipV4 = ipV4;
        this.ipV6 = ipV6;
        this.hostname = hostname;
        this.port = port;
        this.protocol = protocol;
        this.endpoint = endpoint;
        this.path = path;
        this.osKey = osKey;
        this.osSecret = osSecret;
        this.osAuthorize = osAuthorize;
        this.osToken = osToken;
        this.username = username;
        this.password = password;
        this.publicKey = publicKey;
        this.options = options;
        this.appId = appId;
        this.active = active;
        this.sigma = sigma;
        this.metadata = metadata;
        this.language = language;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public XIntegration(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.KEY</code>. 「key」- 集成配置主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.KEY</code>. 「key」- 集成配置主键
     */
    @Override
    public XIntegration setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.NAME</code>. 「name」- 集成名称
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.NAME</code>. 「name」- 集成名称
     */
    @Override
    public XIntegration setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.TYPE</code>. 「type」- 集成类型
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.TYPE</code>. 「type」- 集成类型
     */
    @Override
    public XIntegration setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.IP_V4</code>. 「ipV4」- IP v4地址
     */
    @Override
    public String getIpV4() {
        return this.ipV4;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.IP_V4</code>. 「ipV4」- IP v4地址
     */
    @Override
    public XIntegration setIpV4(String ipV4) {
        this.ipV4 = ipV4;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.IP_V6</code>. 「ipV6」- IP v6地址
     */
    @Override
    public String getIpV6() {
        return this.ipV6;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.IP_V6</code>. 「ipV6」- IP v6地址
     */
    @Override
    public XIntegration setIpV6(String ipV6) {
        this.ipV6 = ipV6;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.HOSTNAME</code>. 「hostname」-
     * 主机地址
     */
    @Override
    public String getHostname() {
        return this.hostname;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.HOSTNAME</code>. 「hostname」-
     * 主机地址
     */
    @Override
    public XIntegration setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.PORT</code>. 「port」- 端口号
     */
    @Override
    public Integer getPort() {
        return this.port;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.PORT</code>. 「port」- 端口号
     */
    @Override
    public XIntegration setPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.PROTOCOL</code>. 「protocol」-
     * 协议类型：HTTP, HTTPS, FTP
     */
    @Override
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.PROTOCOL</code>. 「protocol」-
     * 协议类型：HTTP, HTTPS, FTP
     */
    @Override
    public XIntegration setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.ENDPOINT</code>. 「endpoint」-
     * 端地址
     */
    @Override
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.ENDPOINT</code>. 「endpoint」-
     * 端地址
     */
    @Override
    public XIntegration setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.PATH</code>. 「path」- 集成专用根路径
     */
    @Override
    public String getPath() {
        return this.path;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.PATH</code>. 「path」- 集成专用根路径
     */
    @Override
    public XIntegration setPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.OS_KEY</code>. 「osKey」- 开源专用Key
     */
    @Override
    public String getOsKey() {
        return this.osKey;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.OS_KEY</code>. 「osKey」- 开源专用Key
     */
    @Override
    public XIntegration setOsKey(String osKey) {
        this.osKey = osKey;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.OS_SECRET</code>. 「osSecret」-
     * 开源专用Secret
     */
    @Override
    public String getOsSecret() {
        return this.osSecret;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.OS_SECRET</code>. 「osSecret」-
     * 开源专用Secret
     */
    @Override
    public XIntegration setOsSecret(String osSecret) {
        this.osSecret = osSecret;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.OS_AUTHORIZE</code>.
     * 「osAuthorize」- Authorize接口
     */
    @Override
    public String getOsAuthorize() {
        return this.osAuthorize;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.OS_AUTHORIZE</code>.
     * 「osAuthorize」- Authorize接口
     */
    @Override
    public XIntegration setOsAuthorize(String osAuthorize) {
        this.osAuthorize = osAuthorize;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.OS_TOKEN</code>. 「osToken」-
     * Token接口
     */
    @Override
    public String getOsToken() {
        return this.osToken;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.OS_TOKEN</code>. 「osToken」-
     * Token接口
     */
    @Override
    public XIntegration setOsToken(String osToken) {
        this.osToken = osToken;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.USERNAME</code>. 「username」- 账号
     */
    @Override
    public String getUsername() {
        return this.username;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.USERNAME</code>. 「username」- 账号
     */
    @Override
    public XIntegration setUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.PASSWORD</code>. 「password」- 密码
     */
    @Override
    public String getPassword() {
        return this.password;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.PASSWORD</code>. 「password」- 密码
     */
    @Override
    public XIntegration setPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.PUBLIC_KEY</code>. 「publicKey」-
     * Key文件
     */
    @Override
    public String getPublicKey() {
        return this.publicKey;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.PUBLIC_KEY</code>. 「publicKey」-
     * Key文件
     */
    @Override
    public XIntegration setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.OPTIONS</code>. 「options」-
     * 集成相关配置
     */
    @Override
    public String getOptions() {
        return this.options;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.OPTIONS</code>. 「options」-
     * 集成相关配置
     */
    @Override
    public XIntegration setOptions(String options) {
        this.options = options;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.APP_ID</code>. 「appId」-
     * 关联的应用程序ID
     */
    @Override
    public String getAppId() {
        return this.appId;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.APP_ID</code>. 「appId」-
     * 关联的应用程序ID
     */
    @Override
    public XIntegration setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public XIntegration setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public XIntegration setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.METADATA</code>. 「metadata」-
     * 附加配置
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.METADATA</code>. 「metadata」-
     * 附加配置
     */
    @Override
    public XIntegration setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.LANGUAGE</code>. 「language」-
     * 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.LANGUAGE</code>. 「language」-
     * 使用的语言
     */
    @Override
    public XIntegration setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    @Override
    public XIntegration setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.CREATED_BY</code>. 「createdBy」-
     * 创建人
     */
    @Override
    public XIntegration setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    @Override
    public XIntegration setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.X_INTEGRATION.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.X_INTEGRATION.UPDATED_BY</code>. 「updatedBy」-
     * 更新人
     */
    @Override
    public XIntegration setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("XIntegration (");

        sb.append(key);
        sb.append(", ").append(name);
        sb.append(", ").append(type);
        sb.append(", ").append(ipV4);
        sb.append(", ").append(ipV6);
        sb.append(", ").append(hostname);
        sb.append(", ").append(port);
        sb.append(", ").append(protocol);
        sb.append(", ").append(endpoint);
        sb.append(", ").append(path);
        sb.append(", ").append(osKey);
        sb.append(", ").append(osSecret);
        sb.append(", ").append(osAuthorize);
        sb.append(", ").append(osToken);
        sb.append(", ").append(username);
        sb.append(", ").append(password);
        sb.append(", ").append(publicKey);
        sb.append(", ").append(options);
        sb.append(", ").append(appId);
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
}