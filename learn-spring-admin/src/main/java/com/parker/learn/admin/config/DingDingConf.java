package com.parker.learn.admin.config;

import com.parker.learn.admin.dingding.DingDingNotifier;
import de.codecentric.boot.admin.server.domain.entities.InstanceRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @BelongsProject: learn-spring-cloud
 * @BelongsPackage: com.parker.learn.admin.config
 * @Author: Parker
 * @CreateTime: 2020-09-09 19:47
 * @Description: TODO
 */

@Configuration
public class DingDingConf {

    @Bean
    public DingDingNotifier dingDingNotifier(InstanceRepository repository) {
        return new DingDingNotifier(repository);
    }

}
