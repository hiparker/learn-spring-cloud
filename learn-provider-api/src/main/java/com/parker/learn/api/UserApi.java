package com.parker.learn.api;

import com.parker.learn.api.vo.User;
import org.springframework.web.bind.annotation.*;

/**
 * @BelongsProject: learn-provider-api
 * @BelongsPackage: com.parker.learn.api
 * @Author: Parker
 * @CreateTime: 2020-09-05 01:12
 * @Description: TODO
 */
@RequestMapping("users")
public interface UserApi {

    @GetMapping("/getUser")
    User getUser() throws InterruptedException;

    /**
     * 三种 传参格式
     * 1、 默认                @RequestParam
     * 2、 指定参数名           @RequestParam(name = "xxx")
     * 3、 传输一个Json格式对象  @RequestBody
     * @param userName
     * @return
     */
    @PostMapping("/saveUser")
    User saveUser(@RequestParam(name = "userName") String userName);

}
