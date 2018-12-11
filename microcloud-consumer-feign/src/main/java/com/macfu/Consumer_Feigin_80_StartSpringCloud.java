package com.macfu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @Author: liming
 * @Date: 2018/12/11 10:55
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.macfu.service"})
public class Consumer_Feigin_80_StartSpringCloud {
    public static void main(String[] args) {
        SpringApplication.run(Consumer_Feigin_80_StartSpringCloud.class, args);
    }
}
