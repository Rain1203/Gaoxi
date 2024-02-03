package com.gaoxi.user.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.gaoxi.entity.user.UserEntity;
import com.gaoxi.facade.user.UserService;
import com.gaoxi.req.user.LoginReq;
import com.gaoxi.user.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @description:
 * @author: Qin
 * @createTime: 2024/1/27 16:28
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public UserEntity login(LoginReq loginReq) {
        return userDAO.queryUserInfo(new UserEntity(loginReq.getUsername(), loginReq.getPassword()));
    }
}
