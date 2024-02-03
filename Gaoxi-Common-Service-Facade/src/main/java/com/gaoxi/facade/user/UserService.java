package com.gaoxi.facade.user;

import com.gaoxi.entity.user.UserEntity;
import com.gaoxi.req.user.LoginReq;

/**
 * @description: user服务公共接口类
 * @author: Qin
 * @createTime: 2024/1/27 15:02
 */
public interface UserService {

    UserEntity login(LoginReq loginReq);
}
