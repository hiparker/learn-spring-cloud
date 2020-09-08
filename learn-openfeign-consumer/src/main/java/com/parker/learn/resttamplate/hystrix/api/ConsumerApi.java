package com.parker.learn.resttamplate.hystrix.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @BelongsProject: learn-openfeign-consumer
 * @BelongsPackage: com.parker.learn.openfeign.openfeign.api
 * @Author: Parker
 * @CreateTime: 2020-09-05 00:48
 * @Description:
 */
//@FeignClient(name = "provider")
public interface ConsumerApi {

    // 结合 Eureka 做客户端负载
    @GetMapping("getHi")
    String getHi();

}
