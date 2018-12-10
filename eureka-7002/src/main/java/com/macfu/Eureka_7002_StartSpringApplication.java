package com.macfu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: liming
 * @Date: 2018/12/10 17:05
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class Eureka_7002_StartSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(Eureka_7002_StartSpringApplication.class, args);
    }

}
