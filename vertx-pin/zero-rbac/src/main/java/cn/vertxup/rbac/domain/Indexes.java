/*
 * This file is generated by jOOQ.
*/
package cn.vertxup.rbac.domain;


import cn.vertxup.rbac.domain.tables.OAccessToken;
import cn.vertxup.rbac.domain.tables.OUser;
import cn.vertxup.rbac.domain.tables.RGroupRole;
import cn.vertxup.rbac.domain.tables.RRolePerm;
import cn.vertxup.rbac.domain.tables.RUserGroup;
import cn.vertxup.rbac.domain.tables.RUserRole;
import cn.vertxup.rbac.domain.tables.SAction;
import cn.vertxup.rbac.domain.tables.SGroup;
import cn.vertxup.rbac.domain.tables.SPacket;
import cn.vertxup.rbac.domain.tables.SPath;
import cn.vertxup.rbac.domain.tables.SPermSet;
import cn.vertxup.rbac.domain.tables.SPermission;
import cn.vertxup.rbac.domain.tables.SResource;
import cn.vertxup.rbac.domain.tables.SRole;
import cn.vertxup.rbac.domain.tables.SUser;
import cn.vertxup.rbac.domain.tables.SView;
import cn.vertxup.rbac.domain.tables.SVisitant;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>DB_ETERNAL</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index O_ACCESS_TOKEN_PRIMARY = Indexes0.O_ACCESS_TOKEN_PRIMARY;
    public static final Index O_USER_CLIENT_ID = Indexes0.O_USER_CLIENT_ID;
    public static final Index O_USER_CLIENT_SECRET = Indexes0.O_USER_CLIENT_SECRET;
    public static final Index O_USER_IDXM_O_USER_OAUTH_AUTHORIZE_APP = Indexes0.O_USER_IDXM_O_USER_OAUTH_AUTHORIZE_APP;
    public static final Index O_USER_IDXM_O_USER_OAUTH_AUTHORIZE_FULL = Indexes0.O_USER_IDXM_O_USER_OAUTH_AUTHORIZE_FULL;
    public static final Index O_USER_PRIMARY = Indexes0.O_USER_PRIMARY;
    public static final Index R_GROUP_ROLE_PRIMARY = Indexes0.R_GROUP_ROLE_PRIMARY;
    public static final Index R_ROLE_PERM_PRIMARY = Indexes0.R_ROLE_PERM_PRIMARY;
    public static final Index R_USER_GROUP_IDX_R_USER_GROUP_USER_ID = Indexes0.R_USER_GROUP_IDX_R_USER_GROUP_USER_ID;
    public static final Index R_USER_GROUP_PRIMARY = Indexes0.R_USER_GROUP_PRIMARY;
    public static final Index R_USER_ROLE_IDX_R_USER_ROLE_USER_ID = Indexes0.R_USER_ROLE_IDX_R_USER_ROLE_USER_ID;
    public static final Index R_USER_ROLE_PRIMARY = Indexes0.R_USER_ROLE_PRIMARY;
    public static final Index S_ACTION_CODE = Indexes0.S_ACTION_CODE;
    public static final Index S_ACTION_IDXM_S_ACTION_SIGMA_URI_METHOD = Indexes0.S_ACTION_IDXM_S_ACTION_SIGMA_URI_METHOD;
    public static final Index S_ACTION_IDXM_S_ACTION_URI_METHOD = Indexes0.S_ACTION_IDXM_S_ACTION_URI_METHOD;
    public static final Index S_ACTION_IDX_S_ACTION_PERMISSION_ID = Indexes0.S_ACTION_IDX_S_ACTION_PERMISSION_ID;
    public static final Index S_ACTION_PRIMARY = Indexes0.S_ACTION_PRIMARY;
    public static final Index S_ACTION_RESOURCE_ID = Indexes0.S_ACTION_RESOURCE_ID;
    public static final Index S_ACTION_URI = Indexes0.S_ACTION_URI;
    public static final Index S_GROUP_CODE = Indexes0.S_GROUP_CODE;
    public static final Index S_GROUP_PRIMARY = Indexes0.S_GROUP_PRIMARY;
    public static final Index S_PACKET_IDX_S_PACKET_PATH_ID = Indexes0.S_PACKET_IDX_S_PACKET_PATH_ID;
    public static final Index S_PACKET_PATH_ID = Indexes0.S_PACKET_PATH_ID;
    public static final Index S_PACKET_PRIMARY = Indexes0.S_PACKET_PRIMARY;
    public static final Index S_PATH_CODE = Indexes0.S_PATH_CODE;
    public static final Index S_PATH_PRIMARY = Indexes0.S_PATH_PRIMARY;
    public static final Index S_PERMISSION_CODE = Indexes0.S_PERMISSION_CODE;
    public static final Index S_PERMISSION_PRIMARY = Indexes0.S_PERMISSION_PRIMARY;
    public static final Index S_PERM_SET_NAME = Indexes0.S_PERM_SET_NAME;
    public static final Index S_PERM_SET_PRIMARY = Indexes0.S_PERM_SET_PRIMARY;
    public static final Index S_RESOURCE_CODE = Indexes0.S_RESOURCE_CODE;
    public static final Index S_RESOURCE_PRIMARY = Indexes0.S_RESOURCE_PRIMARY;
    public static final Index S_ROLE_CODE = Indexes0.S_ROLE_CODE;
    public static final Index S_ROLE_PRIMARY = Indexes0.S_ROLE_PRIMARY;
    public static final Index S_USER_IDX_S_USER_USERNAME = Indexes0.S_USER_IDX_S_USER_USERNAME;
    public static final Index S_USER_PRIMARY = Indexes0.S_USER_PRIMARY;
    public static final Index S_USER_USERNAME = Indexes0.S_USER_USERNAME;
    public static final Index S_VIEW_OWNER = Indexes0.S_VIEW_OWNER;
    public static final Index S_VIEW_PRIMARY = Indexes0.S_VIEW_PRIMARY;
    public static final Index S_VISITANT_IDXM_S_VISITANT_VIEW_ID_TYPE_CONFIG = Indexes0.S_VISITANT_IDXM_S_VISITANT_VIEW_ID_TYPE_CONFIG;
    public static final Index S_VISITANT_IDXM_S_VISITANT_VIEW_ID_TYPE_IDENTIFIER = Indexes0.S_VISITANT_IDXM_S_VISITANT_VIEW_ID_TYPE_IDENTIFIER;
    public static final Index S_VISITANT_PRIMARY = Indexes0.S_VISITANT_PRIMARY;
    public static final Index S_VISITANT_VIEW_ID = Indexes0.S_VISITANT_VIEW_ID;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index O_ACCESS_TOKEN_PRIMARY = Internal.createIndex("PRIMARY", OAccessToken.O_ACCESS_TOKEN, new OrderField[] { OAccessToken.O_ACCESS_TOKEN.KEY }, true);
        public static Index O_USER_CLIENT_ID = Internal.createIndex("CLIENT_ID", OUser.O_USER, new OrderField[] { OUser.O_USER.CLIENT_ID }, true);
        public static Index O_USER_CLIENT_SECRET = Internal.createIndex("CLIENT_SECRET", OUser.O_USER, new OrderField[] { OUser.O_USER.CLIENT_SECRET }, true);
        public static Index O_USER_IDXM_O_USER_OAUTH_AUTHORIZE_APP = Internal.createIndex("IDXM_O_USER_OAUTH_AUTHORIZE_APP", OUser.O_USER, new OrderField[] { OUser.O_USER.SCOPE, OUser.O_USER.CLIENT_ID, OUser.O_USER.CLIENT_SECRET }, false);
        public static Index O_USER_IDXM_O_USER_OAUTH_AUTHORIZE_FULL = Internal.createIndex("IDXM_O_USER_OAUTH_AUTHORIZE_FULL", OUser.O_USER, new OrderField[] { OUser.O_USER.SCOPE, OUser.O_USER.CLIENT_ID, OUser.O_USER.CLIENT_SECRET, OUser.O_USER.LANGUAGE }, false);
        public static Index O_USER_PRIMARY = Internal.createIndex("PRIMARY", OUser.O_USER, new OrderField[] { OUser.O_USER.KEY }, true);
        public static Index R_GROUP_ROLE_PRIMARY = Internal.createIndex("PRIMARY", RGroupRole.R_GROUP_ROLE, new OrderField[] { RGroupRole.R_GROUP_ROLE.GROUP_ID, RGroupRole.R_GROUP_ROLE.ROLE_ID }, true);
        public static Index R_ROLE_PERM_PRIMARY = Internal.createIndex("PRIMARY", RRolePerm.R_ROLE_PERM, new OrderField[] { RRolePerm.R_ROLE_PERM.PERM_ID, RRolePerm.R_ROLE_PERM.ROLE_ID }, true);
        public static Index R_USER_GROUP_IDX_R_USER_GROUP_USER_ID = Internal.createIndex("IDX_R_USER_GROUP_USER_ID", RUserGroup.R_USER_GROUP, new OrderField[] { RUserGroup.R_USER_GROUP.USER_ID }, false);
        public static Index R_USER_GROUP_PRIMARY = Internal.createIndex("PRIMARY", RUserGroup.R_USER_GROUP, new OrderField[] { RUserGroup.R_USER_GROUP.GROUP_ID, RUserGroup.R_USER_GROUP.USER_ID }, true);
        public static Index R_USER_ROLE_IDX_R_USER_ROLE_USER_ID = Internal.createIndex("IDX_R_USER_ROLE_USER_ID", RUserRole.R_USER_ROLE, new OrderField[] { RUserRole.R_USER_ROLE.USER_ID }, false);
        public static Index R_USER_ROLE_PRIMARY = Internal.createIndex("PRIMARY", RUserRole.R_USER_ROLE, new OrderField[] { RUserRole.R_USER_ROLE.USER_ID, RUserRole.R_USER_ROLE.ROLE_ID }, true);
        public static Index S_ACTION_CODE = Internal.createIndex("CODE", SAction.S_ACTION, new OrderField[] { SAction.S_ACTION.CODE, SAction.S_ACTION.SIGMA }, true);
        public static Index S_ACTION_IDXM_S_ACTION_SIGMA_URI_METHOD = Internal.createIndex("IDXM_S_ACTION_SIGMA_URI_METHOD", SAction.S_ACTION, new OrderField[] { SAction.S_ACTION.SIGMA, SAction.S_ACTION.URI, SAction.S_ACTION.METHOD }, false);
        public static Index S_ACTION_IDXM_S_ACTION_URI_METHOD = Internal.createIndex("IDXM_S_ACTION_URI_METHOD", SAction.S_ACTION, new OrderField[] { SAction.S_ACTION.URI, SAction.S_ACTION.METHOD }, false);
        public static Index S_ACTION_IDX_S_ACTION_PERMISSION_ID = Internal.createIndex("IDX_S_ACTION_PERMISSION_ID", SAction.S_ACTION, new OrderField[] { SAction.S_ACTION.PERMISSION_ID }, false);
        public static Index S_ACTION_PRIMARY = Internal.createIndex("PRIMARY", SAction.S_ACTION, new OrderField[] { SAction.S_ACTION.KEY }, true);
        public static Index S_ACTION_RESOURCE_ID = Internal.createIndex("RESOURCE_ID", SAction.S_ACTION, new OrderField[] { SAction.S_ACTION.RESOURCE_ID }, true);
        public static Index S_ACTION_URI = Internal.createIndex("URI", SAction.S_ACTION, new OrderField[] { SAction.S_ACTION.URI, SAction.S_ACTION.METHOD, SAction.S_ACTION.SIGMA }, true);
        public static Index S_GROUP_CODE = Internal.createIndex("CODE", SGroup.S_GROUP, new OrderField[] { SGroup.S_GROUP.CODE, SGroup.S_GROUP.SIGMA }, true);
        public static Index S_GROUP_PRIMARY = Internal.createIndex("PRIMARY", SGroup.S_GROUP, new OrderField[] { SGroup.S_GROUP.KEY }, true);
        public static Index S_PACKET_IDX_S_PACKET_PATH_ID = Internal.createIndex("IDX_S_PACKET_PATH_ID", SPacket.S_PACKET, new OrderField[] { SPacket.S_PACKET.PATH_ID }, false);
        public static Index S_PACKET_PATH_ID = Internal.createIndex("PATH_ID", SPacket.S_PACKET, new OrderField[] { SPacket.S_PACKET.PATH_ID, SPacket.S_PACKET.RESOURCE_ID, SPacket.S_PACKET.SIGMA }, true);
        public static Index S_PACKET_PRIMARY = Internal.createIndex("PRIMARY", SPacket.S_PACKET, new OrderField[] { SPacket.S_PACKET.KEY }, true);
        public static Index S_PATH_CODE = Internal.createIndex("CODE", SPath.S_PATH, new OrderField[] { SPath.S_PATH.CODE, SPath.S_PATH.SIGMA }, true);
        public static Index S_PATH_PRIMARY = Internal.createIndex("PRIMARY", SPath.S_PATH, new OrderField[] { SPath.S_PATH.KEY }, true);
        public static Index S_PERMISSION_CODE = Internal.createIndex("CODE", SPermission.S_PERMISSION, new OrderField[] { SPermission.S_PERMISSION.CODE, SPermission.S_PERMISSION.SIGMA }, true);
        public static Index S_PERMISSION_PRIMARY = Internal.createIndex("PRIMARY", SPermission.S_PERMISSION, new OrderField[] { SPermission.S_PERMISSION.KEY }, true);
        public static Index S_PERM_SET_NAME = Internal.createIndex("NAME", SPermSet.S_PERM_SET, new OrderField[] { SPermSet.S_PERM_SET.NAME, SPermSet.S_PERM_SET.CODE, SPermSet.S_PERM_SET.SIGMA }, true);
        public static Index S_PERM_SET_PRIMARY = Internal.createIndex("PRIMARY", SPermSet.S_PERM_SET, new OrderField[] { SPermSet.S_PERM_SET.KEY }, true);
        public static Index S_RESOURCE_CODE = Internal.createIndex("CODE", SResource.S_RESOURCE, new OrderField[] { SResource.S_RESOURCE.CODE, SResource.S_RESOURCE.SIGMA }, true);
        public static Index S_RESOURCE_PRIMARY = Internal.createIndex("PRIMARY", SResource.S_RESOURCE, new OrderField[] { SResource.S_RESOURCE.KEY }, true);
        public static Index S_ROLE_CODE = Internal.createIndex("CODE", SRole.S_ROLE, new OrderField[] { SRole.S_ROLE.CODE, SRole.S_ROLE.SIGMA }, true);
        public static Index S_ROLE_PRIMARY = Internal.createIndex("PRIMARY", SRole.S_ROLE, new OrderField[] { SRole.S_ROLE.KEY }, true);
        public static Index S_USER_IDX_S_USER_USERNAME = Internal.createIndex("IDX_S_USER_USERNAME", SUser.S_USER, new OrderField[] { SUser.S_USER.USERNAME }, false);
        public static Index S_USER_PRIMARY = Internal.createIndex("PRIMARY", SUser.S_USER, new OrderField[] { SUser.S_USER.KEY }, true);
        public static Index S_USER_USERNAME = Internal.createIndex("USERNAME", SUser.S_USER, new OrderField[] { SUser.S_USER.USERNAME, SUser.S_USER.SIGMA }, true);
        public static Index S_VIEW_OWNER = Internal.createIndex("OWNER", SView.S_VIEW, new OrderField[] { SView.S_VIEW.OWNER, SView.S_VIEW.OWNER_TYPE, SView.S_VIEW.RESOURCE_ID, SView.S_VIEW.NAME }, true);
        public static Index S_VIEW_PRIMARY = Internal.createIndex("PRIMARY", SView.S_VIEW, new OrderField[] { SView.S_VIEW.KEY }, true);
        public static Index S_VISITANT_IDXM_S_VISITANT_VIEW_ID_TYPE_CONFIG = Internal.createIndex("IDXM_S_VISITANT_VIEW_ID_TYPE_CONFIG", SVisitant.S_VISITANT, new OrderField[] { SVisitant.S_VISITANT.VIEW_ID, SVisitant.S_VISITANT.TYPE, SVisitant.S_VISITANT.CONFIG_KEY }, false);
        public static Index S_VISITANT_IDXM_S_VISITANT_VIEW_ID_TYPE_IDENTIFIER = Internal.createIndex("IDXM_S_VISITANT_VIEW_ID_TYPE_IDENTIFIER", SVisitant.S_VISITANT, new OrderField[] { SVisitant.S_VISITANT.VIEW_ID, SVisitant.S_VISITANT.TYPE, SVisitant.S_VISITANT.IDENTIFIER }, false);
        public static Index S_VISITANT_PRIMARY = Internal.createIndex("PRIMARY", SVisitant.S_VISITANT, new OrderField[] { SVisitant.S_VISITANT.KEY }, true);
        public static Index S_VISITANT_VIEW_ID = Internal.createIndex("VIEW_ID", SVisitant.S_VISITANT, new OrderField[] { SVisitant.S_VISITANT.VIEW_ID, SVisitant.S_VISITANT.TYPE, SVisitant.S_VISITANT.CONFIG_KEY }, true);
    }
}
