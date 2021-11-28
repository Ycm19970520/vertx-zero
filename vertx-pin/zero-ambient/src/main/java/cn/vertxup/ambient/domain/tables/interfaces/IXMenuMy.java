/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain.tables.interfaces;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import java.io.Serializable;
import java.time.LocalDateTime;


import static io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo.*;
/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IXMenuMy extends VertxPojo, Serializable {

    /**
     * Setter for <code>DB_ETERNAL.X_MENU_MY.KEY</code>. 「key」- 菜单主键
     */
    public IXMenuMy setKey(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_MENU_MY.KEY</code>. 「key」- 菜单主键
     */
    public String getKey();

    /**
     * Setter for <code>DB_ETERNAL.X_MENU_MY.ICON</code>. 「icon」- 菜单使用的icon
     */
    public IXMenuMy setIcon(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_MENU_MY.ICON</code>. 「icon」- 菜单使用的icon
     */
    public String getIcon();

    /**
     * Setter for <code>DB_ETERNAL.X_MENU_MY.TEXT</code>. 「text」- 菜单显示文字
     */
    public IXMenuMy setText(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_MENU_MY.TEXT</code>. 「text」- 菜单显示文字
     */
    public String getText();

    /**
     * Setter for <code>DB_ETERNAL.X_MENU_MY.URI</code>. 「uri」- 菜单地址（不包含应用的path）
     */
    public IXMenuMy setUri(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_MENU_MY.URI</code>. 「uri」- 菜单地址（不包含应用的path）
     */
    public String getUri();

    /**
     * Setter for <code>DB_ETERNAL.X_MENU_MY.UI_SORT</code>. 「uiSort」- 菜单排序
     */
    public IXMenuMy setUiSort(Long value);

    /**
     * Getter for <code>DB_ETERNAL.X_MENU_MY.UI_SORT</code>. 「uiSort」- 菜单排序
     */
    public Long getUiSort();

    /**
     * Setter for <code>DB_ETERNAL.X_MENU_MY.UI_PARENT</code>. 「uiParent」- 菜单父ID
     */
    public IXMenuMy setUiParent(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_MENU_MY.UI_PARENT</code>. 「uiParent」- 菜单父ID
     */
    public String getUiParent();

    /**
     * Setter for <code>DB_ETERNAL.X_MENU_MY.UI_COLOR_FG</code>. 「uiColorFg」-
     * 前景色
     */
    public IXMenuMy setUiColorFg(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_MENU_MY.UI_COLOR_FG</code>. 「uiColorFg」-
     * 前景色
     */
    public String getUiColorFg();

    /**
     * Setter for <code>DB_ETERNAL.X_MENU_MY.UI_COLOR_BG</code>. 「uiColorBg」-
     * 背景色
     */
    public IXMenuMy setUiColorBg(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_MENU_MY.UI_COLOR_BG</code>. 「uiColorBg」-
     * 背景色
     */
    public String getUiColorBg();

    /**
     * Setter for <code>DB_ETERNAL.X_MENU_MY.TYPE</code>. 「type」- 菜单类型
     */
    public IXMenuMy setType(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_MENU_MY.TYPE</code>. 「type」- 菜单类型
     */
    public String getType();

    /**
     * Setter for <code>DB_ETERNAL.X_MENU_MY.PAGE</code>. 「page」- 菜单所在页面
     */
    public IXMenuMy setPage(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_MENU_MY.PAGE</code>. 「page」- 菜单所在页面
     */
    public String getPage();

    /**
     * Setter for <code>DB_ETERNAL.X_MENU_MY.POSITION</code>. 「position」- 菜单位置
     */
    public IXMenuMy setPosition(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_MENU_MY.POSITION</code>. 「position」- 菜单位置
     */
    public String getPosition();

    /**
     * Setter for <code>DB_ETERNAL.X_MENU_MY.OWNER</code>. 「owner」- 拥有者ID
     */
    public IXMenuMy setOwner(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_MENU_MY.OWNER</code>. 「owner」- 拥有者ID
     */
    public String getOwner();

    /**
     * Setter for <code>DB_ETERNAL.X_MENU_MY.ACTIVE</code>. 「active」- 是否启用
     */
    public IXMenuMy setActive(Boolean value);

    /**
     * Getter for <code>DB_ETERNAL.X_MENU_MY.ACTIVE</code>. 「active」- 是否启用
     */
    public Boolean getActive();

    /**
     * Setter for <code>DB_ETERNAL.X_MENU_MY.SIGMA</code>. 「sigma」- 统一标识
     */
    public IXMenuMy setSigma(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_MENU_MY.SIGMA</code>. 「sigma」- 统一标识
     */
    public String getSigma();

    /**
     * Setter for <code>DB_ETERNAL.X_MENU_MY.METADATA</code>. 「metadata」- 附加配置
     */
    public IXMenuMy setMetadata(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_MENU_MY.METADATA</code>. 「metadata」- 附加配置
     */
    public String getMetadata();

    /**
     * Setter for <code>DB_ETERNAL.X_MENU_MY.LANGUAGE</code>. 「language」- 使用的语言
     */
    public IXMenuMy setLanguage(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_MENU_MY.LANGUAGE</code>. 「language」- 使用的语言
     */
    public String getLanguage();

    /**
     * Setter for <code>DB_ETERNAL.X_MENU_MY.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    public IXMenuMy setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.X_MENU_MY.CREATED_AT</code>. 「createdAt」-
     * 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>DB_ETERNAL.X_MENU_MY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public IXMenuMy setCreatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_MENU_MY.CREATED_BY</code>. 「createdBy」- 创建人
     */
    public String getCreatedBy();

    /**
     * Setter for <code>DB_ETERNAL.X_MENU_MY.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    public IXMenuMy setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>DB_ETERNAL.X_MENU_MY.UPDATED_AT</code>. 「updatedAt」-
     * 更新时间
     */
    public LocalDateTime getUpdatedAt();

    /**
     * Setter for <code>DB_ETERNAL.X_MENU_MY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public IXMenuMy setUpdatedBy(String value);

    /**
     * Getter for <code>DB_ETERNAL.X_MENU_MY.UPDATED_BY</code>. 「updatedBy」- 更新人
     */
    public String getUpdatedBy();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common
     * interface IXMenuMy
     */
    public void from(IXMenuMy from);

    /**
     * Copy data into another generated Record/POJO implementing the common
     * interface IXMenuMy
     */
    public <E extends IXMenuMy> E into(E into);

        @Override
        public default IXMenuMy fromJson(io.vertx.core.json.JsonObject json) {
                setOrThrow(this::setKey,json::getString,"KEY","java.lang.String");
                setOrThrow(this::setIcon,json::getString,"ICON","java.lang.String");
                setOrThrow(this::setText,json::getString,"TEXT","java.lang.String");
                setOrThrow(this::setUri,json::getString,"URI","java.lang.String");
                setOrThrow(this::setUiSort,json::getLong,"UI_SORT","java.lang.Long");
                setOrThrow(this::setUiParent,json::getString,"UI_PARENT","java.lang.String");
                setOrThrow(this::setUiColorFg,json::getString,"UI_COLOR_FG","java.lang.String");
                setOrThrow(this::setUiColorBg,json::getString,"UI_COLOR_BG","java.lang.String");
                setOrThrow(this::setType,json::getString,"TYPE","java.lang.String");
                setOrThrow(this::setPage,json::getString,"PAGE","java.lang.String");
                setOrThrow(this::setPosition,json::getString,"POSITION","java.lang.String");
                setOrThrow(this::setOwner,json::getString,"OWNER","java.lang.String");
                setOrThrow(this::setActive,json::getBoolean,"ACTIVE","java.lang.Boolean");
                setOrThrow(this::setSigma,json::getString,"SIGMA","java.lang.String");
                setOrThrow(this::setMetadata,json::getString,"METADATA","java.lang.String");
                setOrThrow(this::setLanguage,json::getString,"LANGUAGE","java.lang.String");
                setOrThrow(this::setCreatedAt,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"CREATED_AT","java.time.LocalDateTime");
                setOrThrow(this::setCreatedBy,json::getString,"CREATED_BY","java.lang.String");
                setOrThrow(this::setUpdatedAt,key -> {String s = json.getString(key); return s==null?null:java.time.LocalDateTime.parse(s);},"UPDATED_AT","java.time.LocalDateTime");
                setOrThrow(this::setUpdatedBy,json::getString,"UPDATED_BY","java.lang.String");
                return this;
        }


        @Override
        public default io.vertx.core.json.JsonObject toJson() {
                io.vertx.core.json.JsonObject json = new io.vertx.core.json.JsonObject();
                json.put("KEY",getKey());
                json.put("ICON",getIcon());
                json.put("TEXT",getText());
                json.put("URI",getUri());
                json.put("UI_SORT",getUiSort());
                json.put("UI_PARENT",getUiParent());
                json.put("UI_COLOR_FG",getUiColorFg());
                json.put("UI_COLOR_BG",getUiColorBg());
                json.put("TYPE",getType());
                json.put("PAGE",getPage());
                json.put("POSITION",getPosition());
                json.put("OWNER",getOwner());
                json.put("ACTIVE",getActive());
                json.put("SIGMA",getSigma());
                json.put("METADATA",getMetadata());
                json.put("LANGUAGE",getLanguage());
                json.put("CREATED_AT",getCreatedAt()==null?null:getCreatedAt().toString());
                json.put("CREATED_BY",getCreatedBy());
                json.put("UPDATED_AT",getUpdatedAt()==null?null:getUpdatedAt().toString());
                json.put("UPDATED_BY",getUpdatedBy());
                return json;
        }

}