package com.gaoxi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @description:
 * @author: Qin
 * @createTime: 2024/2/4 13:19
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class FacadeApplication {
    public static void main(String[] args) {
        SpringApplication.run(FacadeApplication.class, args);
        System.out.println("(●'◡'●)   Facade服务启动成功      (●'◡'●)\n");
    }
}
