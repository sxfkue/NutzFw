/*
 * Copyright (c) 2019- 2019 threefish(https://gitee.com/threefish https://github.com/threefish) All Rights Reserved.
 * 本项目完全开源，商用完全免费。但请勿侵犯作者合法权益，如申请软著等。
 * 最后修改时间：2019/10/07 18:27:07
 * 源 码 地 址：https://gitee.com/threefish/NutzFw
 */

package com.nutzfw.modules.portal.entity;

import com.nutzfw.core.common.entity.BaseEntity;
import org.nutz.dao.entity.annotation.*;
import org.nutz.dao.interceptor.annotation.PrevInsert;

import java.io.Serializable;

/**
 * Created by ysy on 2018/6/15 19:27.
 */
@Table("sys_portal_user")
@Comment("首页组合和用户关联")
public class PortalUser extends BaseEntity implements Serializable {
    @Name
    @PrevInsert(uu32 = true)
    @ColDefine(width = 32, notNull = true)
    @Comment("主键")
    @Column("uuid")
    private String id;

    @Column("groupId")
    @Comment("组合id")
    @ColDefine(width = 32, notNull = true)
    private String groupId;

    @Column("userId")
    @Comment("用户id")
    @ColDefine(width = 32, notNull = true)
    private String userId;

    public PortalUser(String id, String groupId, String userId) {
        this.id = id;
        this.groupId = groupId;
        this.userId = userId;
    }

    public PortalUser() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}