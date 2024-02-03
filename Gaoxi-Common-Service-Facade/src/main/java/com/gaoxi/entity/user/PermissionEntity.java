package com.gaoxi.entity.user;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @description: 权限实体类
 * @author: Qin
 * @createTime: 2024/1/27 16:23
 */
@Setter
@Getter
public class PermissionEntity implements Serializable {
    private static final long serialVersionUID = 5370387378446853268L;

    private String id;

    //权限名称
    private String permission;

    private String desc;
}
