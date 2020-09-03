package com.parker.learn.eureka.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created Date by 2020/1/13 0013.
 *
 * 如果eurekaServer设置了登录密码   就必须关闭Spring Security的CSRF验证
 * @author Parker
 */

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        /*
         * 默认情况下添加SpringSecurity依赖的应用每个请求都需要添加CSRF token才能访问，Eureka客户端注册时并不会添加，所以需要配置/eureka/**路径不需要CSRF token。
         */
        http.csrf().disable();

        http.csrf().ignoringAntMatchers("/eureka/**");

        // 开启认证支持HttpBasic
        http.authorizeRequests().anyRequest().authenticated().and().httpBasic();

    }
}
