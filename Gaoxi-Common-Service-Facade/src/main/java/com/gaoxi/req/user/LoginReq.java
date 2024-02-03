package com.gaoxi.req.user;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @description: 登录req
 * @author: Qin
 * @createTime: 2024/1/27 15:07
 */
@Setter
@Getter
public class LoginReq implements Serializable {
    private static final long serialVersionUID = 4876412395601367520L;

    private String username;

    private String password;

    private String phone;

    private String mail;
}
