package com.macfu.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

import javax.annotation.Resource;

/**
 * @Author: liming
 * @Date: 2018/12/5 14:14
 * @Description: 安全配置类，代替yml配置文件中的security
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    /**
     * 自动注入auth对象
     * @param auth
     * @throws Exception
     */
    @Resource
    public void configGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("macfu").password("hello")
                .roles("USER").and().withUser("admin").password("hello").roles("USER","ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 所有的访问都必须进行认证处理后才可以正常运行
        http.httpBasic().and().authorizeRequests().anyRequest().fullyAuthenticated();
        // 所有的Rest服务一定要设置为无状态，以提升性能
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    }
}
