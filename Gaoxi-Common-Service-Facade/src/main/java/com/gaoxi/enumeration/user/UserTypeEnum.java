package com.gaoxi.enumeration.user;

import lombok.Getter;

/**
 * @description:
 * @author: Qin
 * @createTime: 2024/1/27 15:19
 */
@Getter
public enum UserTypeEnum {

    PERSON(1,"个人用户"),
    COMPANY(2,"企业用户"),
    ADMIN(3,"管理员");
    private int code;
    private String msg;

    UserTypeEnum(int code, String msg){
        this.code = code;
        this.msg = msg;
    }

    /**
     * description 根据code获取枚举
     * author Qin
     * createTime 2024/1/27 15:26
     */
    public static UserTypeEnum getEnumByCode(int code){
        for (UserTypeEnum userTypeEnum : UserTypeEnum.values()){
            if (userTypeEnum.code == code){
                return userTypeEnum;
            }
        }
        return null;
    }
}
