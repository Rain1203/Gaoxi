package com.gaoxi.enumeration.user;

import lombok.Getter;

/**
 * @description: 用户状态枚举类
 * @author: Qin
 * @createTime: 2024/1/27 15:27
 */
@Getter
public enum UserStateEnum {
    ON(0,"正常"),
    OFF(1,"禁用");
    private int code;
    private String msg;

    UserStateEnum(int code, String msg){
        this.code = code;
        this.msg = msg;
    }
}
