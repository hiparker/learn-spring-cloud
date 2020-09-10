package com.parker.learn.eureka.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
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
@RefreshScope
public class RestProviderController{

    @Value("${server.port}")
    private int port;

    @Value("${print.text}")
    private String text;

    @Value("${print.version}")
    private int version;

    @RequestMapping("getHi")
    public String getHi(){
        return "Hi Eureka! 我的端口是："+port +" "+text +" 版本号："+version ;
    }

}
