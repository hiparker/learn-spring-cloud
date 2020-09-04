package com.parker.learn.eureka.consumer.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @BelongsProject: consumer
 * @BelongsPackage: com.parker.learn.eureka.consumer.conf
 * @Author: Parker
 * @CreateTime: 2020-09-04 12:10
 * @Description: TODO
 */
@Configuration
public class RestTemplateConf {

    @Bean
    public RestTemplate iRestTemplate(){

        // 这里开启 随机策略 测试 ribbon的策略
        return new RestTemplate();

    }

}
