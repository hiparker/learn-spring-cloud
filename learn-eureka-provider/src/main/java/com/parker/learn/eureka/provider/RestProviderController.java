package com.parker.learn.eureka.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: learn-eureka-provider
 * @BelongsPackage: com.parker.learn.eureka.demo
 * @Author: Parker
 * @CreateTime: 2020-09-03 23:43
 * @Description: TODO
 */
@RestController
public class RestProviderController {

    @Value("${server.port}")
    private int port;


    @RequestMapping("getHi")
    public String getHi(){
        return "Hi Eureka! 我的端口是："+port;
    }

}
