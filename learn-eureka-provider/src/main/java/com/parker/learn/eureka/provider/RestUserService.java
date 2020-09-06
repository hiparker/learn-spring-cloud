package com.parker.learn.eureka.provider;

import com.parker.learn.api.UserApi;
import com.parker.learn.api.vo.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @BelongsProject: learn-eureka-provider
 * @BelongsPackage: com.parker.learn.eureka.demo
 * @Author: Parker
 * @CreateTime: 2020-09-03 23:43
 * @Description: TODO
 */
@RestController
public class RestUserService implements UserApi {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    @Override
    public User getUser() throws InterruptedException {
        int i = atomicInteger.incrementAndGet();
        System.out.println("重试次数 "+i);

        // 睡眠 来测试 ribbon的重试次数
        TimeUnit.SECONDS.sleep(7);
        return new User("测试");
    }

    @Override
    public User saveUser(String userName) {
        return new User(userName);
    }
}
