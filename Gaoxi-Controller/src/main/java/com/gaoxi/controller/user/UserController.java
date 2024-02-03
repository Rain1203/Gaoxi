package com.gaoxi.controller.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gaoxi.entity.user.UserEntity;
import com.gaoxi.facade.user.UserService;
import com.gaoxi.req.user.LoginReq;
import com.gaoxi.resp.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @description:
 * @author: Qin
 * @createTime: 2024/1/28 14:14
 */
@RestController
public class UserController {

    @Reference
    private UserService userService;

    @PostMapping("/login")
    public Result login(@RequestBody LoginReq loginReq, HttpServletResponse httpRsp){
        UserEntity user = userService.login(loginReq);
        //todo 登录成功
        return Result.newSuccessResult(user);
    }
}
