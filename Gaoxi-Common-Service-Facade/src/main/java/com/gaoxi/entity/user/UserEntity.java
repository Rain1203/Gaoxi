package com.gaoxi.entity.user;

import com.gaoxi.enumeration.user.UserStateEnum;
import com.gaoxi.enumeration.user.UserTypeEnum;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @description: 用户实体类
 * @author: Qin
 * @createTime: 2024/1/27 15:06
 */
@Setter
@Getter
public class UserEntity implements Serializable {
    private static final long serialVersionUID = -3383201813232421258L;

    //
    private String id;

    private String username;

    private String password;

    private String phone;

    private String mail;

    private String licencePic;

    private Timestamp registerTime;

    private UserTypeEnum userTypeEnum;

    private UserStateEnum userStateEnum;

    private RoleEntity roleEntity;

    public UserEntity(){}

    public UserEntity(String username, String password){
        this.username = username;
        this.password = password;
    }
}
