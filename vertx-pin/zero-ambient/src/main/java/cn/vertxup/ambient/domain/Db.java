/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.ambient.domain;


import cn.vertxup.ambient.domain.tables.*;
import io.vertx.tp.ke.refine.Ke;
import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Db extends SchemaImpl {

    /**
     * The reference instance of <code>DB_ETERNAL</code>
     */
    public static final Db DB_ETERNAL = new Db();
    private static final long serialVersionUID = 1L;
    /**
     * The table <code>DB_ETERNAL.X_ACTIVITY</code>.
     */
    public final XActivity X_ACTIVITY = XActivity.X_ACTIVITY;

    /**
     * The table <code>DB_ETERNAL.X_ACTIVITY_CHANGE</code>.
     */
    public final XActivityChange X_ACTIVITY_CHANGE = XActivityChange.X_ACTIVITY_CHANGE;

    /**
     * The table <code>DB_ETERNAL.X_APP</code>.
     */
    public final XApp X_APP = XApp.X_APP;

    /**
     * The table <code>DB_ETERNAL.X_ATTACHMENT</code>.
     */
    public final XAttachment X_ATTACHMENT = XAttachment.X_ATTACHMENT;

    /**
     * The table <code>DB_ETERNAL.X_CATEGORY</code>.
     */
    public final XCategory X_CATEGORY = XCategory.X_CATEGORY;

    /**
     * The table <code>DB_ETERNAL.X_EMAIL_SERVER</code>.
     */
    public final XEmailServer X_EMAIL_SERVER = XEmailServer.X_EMAIL_SERVER;

    /**
     * The table <code>DB_ETERNAL.X_INTEGRATION</code>.
     */
    public final XIntegration X_INTEGRATION = XIntegration.X_INTEGRATION;

    /**
     * The table <code>DB_ETERNAL.X_LINKAGE</code>.
     */
    public final XLinkage X_LINKAGE = XLinkage.X_LINKAGE;

    /**
     * The table <code>DB_ETERNAL.X_LOG</code>.
     */
    public final XLog X_LOG = XLog.X_LOG;

    /**
     * The table <code>DB_ETERNAL.X_MENU</code>.
     */
    public final XMenu X_MENU = XMenu.X_MENU;

    /**
     * The table <code>DB_ETERNAL.X_MENU_MY</code>.
     */
    public final XMenuMy X_MENU_MY = XMenuMy.X_MENU_MY;

    /**
     * The table <code>DB_ETERNAL.X_MESSAGE</code>.
     */
    public final XMessage X_MESSAGE = XMessage.X_MESSAGE;

    /**
     * The table <code>DB_ETERNAL.X_MESSAGE_TPL</code>.
     */
    public final XMessageTpl X_MESSAGE_TPL = XMessageTpl.X_MESSAGE_TPL;

    /**
     * The table <code>DB_ETERNAL.X_MODULE</code>.
     */
    public final XModule X_MODULE = XModule.X_MODULE;

    /**
     * The table <code>DB_ETERNAL.X_NOTICE</code>.
     */
    public final XNotice X_NOTICE = XNotice.X_NOTICE;

    /**
     * The table <code>DB_ETERNAL.X_NUMBER</code>.
     */
    public final XNumber X_NUMBER = XNumber.X_NUMBER;

    /**
     * The table <code>DB_ETERNAL.X_SOURCE</code>.
     */
    public final XSource X_SOURCE = XSource.X_SOURCE;

    /**
     * The table <code>DB_ETERNAL.X_TABULAR</code>.
     */
    public final XTabular X_TABULAR = XTabular.X_TABULAR;

    /**
     * No further instances allowed
     */
    private Db() {
        super(Ke.getDatabase(), null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            XActivity.X_ACTIVITY,
            XActivityChange.X_ACTIVITY_CHANGE,
            XApp.X_APP,
            XAttachment.X_ATTACHMENT,
            XCategory.X_CATEGORY,
            XEmailServer.X_EMAIL_SERVER,
            XIntegration.X_INTEGRATION,
            XLinkage.X_LINKAGE,
            XLog.X_LOG,
            XMenu.X_MENU,
            XMenuMy.X_MENU_MY,
            XMessage.X_MESSAGE,
            XMessageTpl.X_MESSAGE_TPL,
            XModule.X_MODULE,
            XNotice.X_NOTICE,
            XNumber.X_NUMBER,
            XSource.X_SOURCE,
            XTabular.X_TABULAR
        );
    }
}
