package com.parker.learn.openfeign.openfeign.conf;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @BelongsProject: learn-openfeign-consumer
 * @BelongsPackage: com.parker.learn.openfeign.openfeign.conf
 * @Author: Parker
 * @CreateTime: 2020-09-05 01:05
 * @Description: TODO
 */
@Configuration
public class RibbonConf {

    /**
     * 设置Ribbon的 策略
     * @return
     */
    @Bean
    public IRule strategyRule(){
        return new RandomRule();
    }

}
