package com.parker.learn.resttamplate.hystrix.conf;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
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
    @LoadBalanced
    public RestTemplate getRestTemplate(){

        return new RestTemplate();

    }

}
