package com.parker.learn.eureka.consumer.conf;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @BelongsProject: consumer
 * @BelongsPackage: com.parker.learn.eureka.consumer.conf
 * @Author: Parker
 * @CreateTime: 2020-09-04 12:10
 * @Description: TODO
 */
@Configuration
public class RibbonConf {

    @Bean
    public IRule strategyRule(){

        // 这里开启 随机策略 测试 ribbon的策略
        return new RandomRule();

    }

}
