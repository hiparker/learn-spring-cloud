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
@FeignClient(name = "single",url = "192.168.0.102:7601")
public interface ConsumerApiBySingle {

    // 针对 Feign 的 单独调用

    @GetMapping("getHi")
    String getHi();

}
