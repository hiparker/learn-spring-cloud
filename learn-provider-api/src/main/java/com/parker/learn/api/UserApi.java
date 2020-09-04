package com.parker.learn.api;

import com.parker.learn.api.vo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    User getUser();

    @PostMapping("/saveUser")
    User saveUser(@RequestParam String userName);

}
