package com.parker.learn.eureka.provider;

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

    @RequestMapping("getHi")
    public String getHi(){
        return "Hi Eureka!";
    }

}
