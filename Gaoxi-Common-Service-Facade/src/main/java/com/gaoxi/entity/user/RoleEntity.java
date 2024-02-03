package com.gaoxi.entity.user;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
import java.util.List;

/**
 * @description: 角色实体类
 * @author: Qin
 * @createTime: 2024/1/27 15:31
 */
@Setter
@Getter
public class RoleEntity implements Serializable {
    private static final long serialVersionUID = 2048224636682990966L;

    private String id;

    private String name;

    private String desc;

    //角色能访问的菜单列表
    private List<MenuEntity> menuList;

    //角色所拥有的权限列表
    private List<PermissionEntity> permissionList;
}
