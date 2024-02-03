package com.gaoxi.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description:
 * @author: Qin
 * @createTime: 2024/1/27 16:26
 */
@SpringBootApplication
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
        System.out.println("(●'◡'●)   User服务启动成功      (●'◡'●)\n");
    }
}
