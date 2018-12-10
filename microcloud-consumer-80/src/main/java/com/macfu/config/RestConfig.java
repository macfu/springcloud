package com.macfu.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;
import java.util.Base64;

/**
 * @Author: liming
 * @Date: 2018/12/4 14:02
 * @Description: RestTemplate类对象模板
 */
@Configuration
public class RestConfig {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    /**
     * 在provider-dept-8001项目中配置了SpringSecurity，所以访问rest服务时需要在头信息上添加配置认证信息
     * @return 包含有认证信息的HttpHeaders
     */
    @Bean
    public HttpHeaders getHeaders() {
        // 定义一个Http的头信息
        HttpHeaders headers = new HttpHeaders();
        // 认证的原始信息
        String auth = "macfu:hello";
        // 进行加密处理
        byte[] encode = Base64.getEncoder().encode(auth.getBytes(Charset.forName("US-ASCII")));
        // 在进行授权的头信息内容配置的时候加密的信息一定要与"Basic"之间有一个空格
        String authHeader = "Basic " + new String(encode);
        headers.set("Authorization", authHeader);
        return headers;
    }
}
