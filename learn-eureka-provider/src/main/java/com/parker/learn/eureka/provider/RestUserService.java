package com.parker.learn.eureka.provider;

import com.parker.learn.api.UserApi;
import com.parker.learn.api.vo.User;
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
public class RestUserService implements UserApi {


    @Override
    public User getUser() {
        return new User("测试");
    }

    @Override
    public User saveUser(String userName) {
        return new User(userName);
    }
}
