/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.battery.domain.tables.pojos;


import cn.vertxup.battery.domain.tables.interfaces.IBBlock;

import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BBlock implements VertxPojo, IBBlock {

    private static final long serialVersionUID = 1L;

    private String        key;
    private String        code;
    private String        name;
    private String        version;
    private Boolean       authorized;
    private String        uiIcon;
    private String        uiStyle;
    private Long          uiSort;
    private String        uiConfig;
    private String        signIssuer;
    private String        signName;
    private LocalDateTime signAt;
    private String        signSecret;
    private String        signLic;
    private LocalDateTime signEnd;
    private LocalDateTime signStart;
    private String        licIdentifier;
    private String        licMenu;
    private String        appId;
    private String        bagId;
    private Boolean       active;
    private String        sigma;
    private String        metadata;
    private String        language;
    private LocalDateTime createdAt;
    private String        createdBy;
    private LocalDateTime updatedAt;
    private String        updatedBy;

    public BBlock() {}

    public BBlock(IBBlock value) {
        this.key = value.getKey();
        this.code = value.getCode();
        this.name = value.getName();
        this.version = value.getVersion();
        this.authorized = value.getAuthorized();
        this.uiIcon = value.getUiIcon();
        this.uiStyle = value.getUiStyle();
        this.uiSort = value.getUiSort();
        this.uiConfig = value.getUiConfig();
        this.signIssuer = value.getSignIssuer();
        this.signName = value.getSignName();
        this.signAt = value.getSignAt();
        this.signSecret = value.getSignSecret();
        this.signLic = value.getSignLic();
        this.signEnd = value.getSignEnd();
        this.signStart = value.getSignStart();
        this.licIdentifier = value.getLicIdentifier();
        this.licMenu = value.getLicMenu();
        this.appId = value.getAppId();
        this.bagId = value.getBagId();
        this.active = value.getActive();
        this.sigma = value.getSigma();
        this.metadata = value.getMetadata();
        this.language = value.getLanguage();
        this.createdAt = value.getCreatedAt();
        this.createdBy = value.getCreatedBy();
        this.updatedAt = value.getUpdatedAt();
        this.updatedBy = value.getUpdatedBy();
    }

    public BBlock(
        String        key,
        String        code,
        String        name,
        String        version,
        Boolean       authorized,
        String        uiIcon,
        String        uiStyle,
        Long          uiSort,
        String        uiConfig,
        String        signIssuer,
        String        signName,
        LocalDateTime signAt,
        String        signSecret,
        String        signLic,
        LocalDateTime signEnd,
        LocalDateTime signStart,
        String        licIdentifier,
        String        licMenu,
        String        appId,
        String        bagId,
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
        this.code = code;
        this.name = name;
        this.version = version;
        this.authorized = authorized;
        this.uiIcon = uiIcon;
        this.uiStyle = uiStyle;
        this.uiSort = uiSort;
        this.uiConfig = uiConfig;
        this.signIssuer = signIssuer;
        this.signName = signName;
        this.signAt = signAt;
        this.signSecret = signSecret;
        this.signLic = signLic;
        this.signEnd = signEnd;
        this.signStart = signStart;
        this.licIdentifier = licIdentifier;
        this.licMenu = licMenu;
        this.appId = appId;
        this.bagId = bagId;
        this.active = active;
        this.sigma = sigma;
        this.metadata = metadata;
        this.language = language;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }

        public BBlock(io.vertx.core.json.JsonObject json) {
                this();
                fromJson(json);
        }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.KEY</code>. 「key」- 模块主键
     */
    @Override
    public String getKey() {
        return this.key;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.KEY</code>. 「key」- 模块主键
     */
    @Override
    public BBlock setKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.CODE</code>. 「code」- 子模块编码
     */
    @Override
    public String getCode() {
        return this.code;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.CODE</code>. 「code」- 子模块编码
     */
    @Override
    public BBlock setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.NAME</code>. 「name」- 子模块名称
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.NAME</code>. 「name」- 子模块名称
     */
    @Override
    public BBlock setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.VERSION</code>. 「version」- 子模块版本
     */
    @Override
    public String getVersion() {
        return this.version;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.VERSION</code>. 「version」- 子模块版本
     */
    @Override
    public BBlock setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.AUTHORIZED</code>. 「authorized」- 是否授权
     */
    @Override
    public Boolean getAuthorized() {
        return this.authorized;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.AUTHORIZED</code>. 「authorized」- 是否授权
     */
    @Override
    public BBlock setAuthorized(Boolean authorized) {
        this.authorized = authorized;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.UI_ICON</code>. 「uiIcon」- 子模块图标
     */
    @Override
    public String getUiIcon() {
        return this.uiIcon;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.UI_ICON</code>. 「uiIcon」- 子模块图标
     */
    @Override
    public BBlock setUiIcon(String uiIcon) {
        this.uiIcon = uiIcon;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.UI_STYLE</code>. 「uiStyle」- 子模块风格
     */
    @Override
    public String getUiStyle() {
        return this.uiStyle;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.UI_STYLE</code>. 「uiStyle」- 子模块风格
     */
    @Override
    public BBlock setUiStyle(String uiStyle) {
        this.uiStyle = uiStyle;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.UI_SORT</code>. 「uiSort」- 子模块排序
     */
    @Override
    public Long getUiSort() {
        return this.uiSort;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.UI_SORT</code>. 「uiSort」- 子模块排序
     */
    @Override
    public BBlock setUiSort(Long uiSort) {
        this.uiSort = uiSort;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.UI_CONFIG</code>. 「uiConfig」- 子模块核心配置
     */
    @Override
    public String getUiConfig() {
        return this.uiConfig;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.UI_CONFIG</code>. 「uiConfig」- 子模块核心配置
     */
    @Override
    public BBlock setUiConfig(String uiConfig) {
        this.uiConfig = uiConfig;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.SIGN_ISSUER</code>. 「signIssuer」-
     * 许可证发证机构
     */
    @Override
    public String getSignIssuer() {
        return this.signIssuer;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.SIGN_ISSUER</code>. 「signIssuer」-
     * 许可证发证机构
     */
    @Override
    public BBlock setSignIssuer(String signIssuer) {
        this.signIssuer = signIssuer;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.SIGN_NAME</code>. 「signName」- 许可证名称
     */
    @Override
    public String getSignName() {
        return this.signName;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.SIGN_NAME</code>. 「signName」- 许可证名称
     */
    @Override
    public BBlock setSignName(String signName) {
        this.signName = signName;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.SIGN_AT</code>. 「signAt」- 发证时间
     */
    @Override
    public LocalDateTime getSignAt() {
        return this.signAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.SIGN_AT</code>. 「signAt」- 发证时间
     */
    @Override
    public BBlock setSignAt(LocalDateTime signAt) {
        this.signAt = signAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.SIGN_SECRET</code>. 「signSecret」-
     * 证书专用密钥
     */
    @Override
    public String getSignSecret() {
        return this.signSecret;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.SIGN_SECRET</code>. 「signSecret」-
     * 证书专用密钥
     */
    @Override
    public BBlock setSignSecret(String signSecret) {
        this.signSecret = signSecret;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.SIGN_LIC</code>. 「signLic」- 许可证内容
     */
    @Override
    public String getSignLic() {
        return this.signLic;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.SIGN_LIC</code>. 「signLic」- 许可证内容
     */
    @Override
    public BBlock setSignLic(String signLic) {
        this.signLic = signLic;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.SIGN_END</code>. 「signEnd」- 证书过期时间
     */
    @Override
    public LocalDateTime getSignEnd() {
        return this.signEnd;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.SIGN_END</code>. 「signEnd」- 证书过期时间
     */
    @Override
    public BBlock setSignEnd(LocalDateTime signEnd) {
        this.signEnd = signEnd;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.SIGN_START</code>. 「signStart」-
     * 证书过期时间
     */
    @Override
    public LocalDateTime getSignStart() {
        return this.signStart;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.SIGN_START</code>. 「signStart」-
     * 证书过期时间
     */
    @Override
    public BBlock setSignStart(LocalDateTime signStart) {
        this.signStart = signStart;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.LIC_IDENTIFIER</code>.
     * 「licIdentifier」- 允许的模型标识
     */
    @Override
    public String getLicIdentifier() {
        return this.licIdentifier;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.LIC_IDENTIFIER</code>.
     * 「licIdentifier」- 允许的模型标识
     */
    @Override
    public BBlock setLicIdentifier(String licIdentifier) {
        this.licIdentifier = licIdentifier;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.LIC_MENU</code>. 「licMenu」-
     * 该Block包含的菜单
     */
    @Override
    public String getLicMenu() {
        return this.licMenu;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.LIC_MENU</code>. 「licMenu」-
     * 该Block包含的菜单
     */
    @Override
    public BBlock setLicMenu(String licMenu) {
        this.licMenu = licMenu;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.APP_ID</code>. 「appId」- 关联的应用程序ID
     */
    @Override
    public String getAppId() {
        return this.appId;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.APP_ID</code>. 「appId」- 关联的应用程序ID
     */
    @Override
    public BBlock setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.BAG_ID</code>. 「bagId」- 所属包ID
     */
    @Override
    public String getBagId() {
        return this.bagId;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.BAG_ID</code>. 「bagId」- 所属包ID
     */
    @Override
    public BBlock setBagId(String bagId) {
        this.bagId = bagId;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public Boolean getActive() {
        return this.active;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.ACTIVE</code>. 「active」- 是否启用
     */
    @Override
    public BBlock setActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public String getSigma() {
        return this.sigma;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.SIGMA</code>. 「sigma」- 统一标识
     */
    @Override
    public BBlock setSigma(String sigma) {
        this.sigma = sigma;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public String getMetadata() {
        return this.metadata;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.METADATA</code>. 「metadata」- 附加配置
     */
    @Override
    public BBlock setMetadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public String getLanguage() {
        return this.language;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.LANGUAGE</code>. 「language」- 使用的语言
     */
    @Override
    public BBlock setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.CREATED_AT</code>. 「createdAt」- 创建时间
     */
    @Override
    public BBlock setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.CREATED_BY</code>. 「createdBy」- 创建人
     */
    @Override
    public BBlock setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.UPDATED_AT</code>. 「updatedAt」- 更新时间
     */
    @Override
    public BBlock setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Getter for <code>DB_ETERNAL.B_BLOCK.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * Setter for <code>DB_ETERNAL.B_BLOCK.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    @Override
    public BBlock setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("BBlock (");

        sb.append(key);
        sb.append(", ").append(code);
        sb.append(", ").append(name);
        sb.append(", ").append(version);
        sb.append(", ").append(authorized);
        sb.append(", ").append(uiIcon);
        sb.append(", ").append(uiStyle);
        sb.append(", ").append(uiSort);
        sb.append(", ").append(uiConfig);
        sb.append(", ").append(signIssuer);
        sb.append(", ").append(signName);
        sb.append(", ").append(signAt);
        sb.append(", ").append(signSecret);
        sb.append(", ").append(signLic);
        sb.append(", ").append(signEnd);
        sb.append(", ").append(signStart);
        sb.append(", ").append(licIdentifier);
        sb.append(", ").append(licMenu);
        sb.append(", ").append(appId);
        sb.append(", ").append(bagId);
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
    public void from(IBBlock from) {
        setKey(from.getKey());
        setCode(from.getCode());
        setName(from.getName());
        setVersion(from.getVersion());
        setAuthorized(from.getAuthorized());
        setUiIcon(from.getUiIcon());
        setUiStyle(from.getUiStyle());
        setUiSort(from.getUiSort());
        setUiConfig(from.getUiConfig());
        setSignIssuer(from.getSignIssuer());
        setSignName(from.getSignName());
        setSignAt(from.getSignAt());
        setSignSecret(from.getSignSecret());
        setSignLic(from.getSignLic());
        setSignEnd(from.getSignEnd());
        setSignStart(from.getSignStart());
        setLicIdentifier(from.getLicIdentifier());
        setLicMenu(from.getLicMenu());
        setAppId(from.getAppId());
        setBagId(from.getBagId());
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
    public <E extends IBBlock> E into(E into) {
        into.from(this);
        return into;
    }
}