package com.macfu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: liming
 * @Date: 2018/12/5 17:28
 * @Description: Eureka服务启动程序类
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka_7001_StartSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(Eureka_7001_StartSpringApplication.class, args);
    }
}
