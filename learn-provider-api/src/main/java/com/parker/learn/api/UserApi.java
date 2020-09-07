package com.parker.learn.api;

import com.parker.learn.api.dto.User;
import org.springframework.web.bind.annotation.*;

/**
 * @BelongsProject: learn-provider-api
 * @BelongsPackage: com.parker.learn.api
 * @Author: Parker
 * @CreateTime: 2020-09-05 01:12
 * @Description: TODO
 *
 * 坑：  使用 hystrix 不能在上面直接定义 mapping
 *
 */
//@RequestMapping("users")
public interface UserApi {

    @GetMapping("/users/getUser")
    ResultDto<User> getUser();

    /**
     * 三种 传参格式
     * 1、 默认                @RequestParam
     * 2、 指定参数名           @RequestParam(name = "xxx")
     * 3、 传输一个Json格式对象  @RequestBody
     * @param userName
     * @return
     */
    @PostMapping("/users/saveUser")
    ResultDto<User> saveUser(@RequestParam(name = "userName") String userName);

}
