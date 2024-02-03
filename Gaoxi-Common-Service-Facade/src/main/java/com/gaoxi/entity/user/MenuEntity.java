package com.gaoxi.entity.user;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @description: 菜单实体类
 * @author: Qin
 * @createTime: 2024/1/27 16:20
 */
@Setter
@Getter
public class MenuEntity implements Serializable {
    private static final long serialVersionUID = 6615015726286586688L;

    private String id;

    private String menuName;

    private String url;

    private String parentId;

}
