package com.macfu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: liming
 * @Date: 2018/12/3 15:18
 * @Description: 主程序启动类
 */
@SpringBootApplication
@EnableEurekaClient
public class Dept_8001_StartSpringCloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(Dept_8001_StartSpringCloudApplication.class, args);
    }
}
