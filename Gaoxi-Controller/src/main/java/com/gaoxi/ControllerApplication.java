package com.gaoxi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description:
 * @author: Qin
 * @createTime: 2024/1/28 14:12
 */
@SpringBootApplication
public class ControllerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ControllerApplication.class, args);
        System.out.println("(●'◡'●)   Controller服务启动成功      (●'◡'●)\n");
    }
}
