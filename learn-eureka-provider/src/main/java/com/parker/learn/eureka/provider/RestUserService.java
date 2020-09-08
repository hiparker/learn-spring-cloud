package com.parker.learn.eureka.provider;

import com.parker.learn.api.ResultDto;
import com.parker.learn.api.UserApi;
import com.parker.learn.api.dto.User;
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
    public ResultDto<User> getUser(){
        ResultDto<User> resultDto = new ResultDto<>();

        int i = atomicInteger.incrementAndGet();
        System.out.println("重试次数 "+i);

        // 睡眠 来测试 ribbon的重试次数
        try {
            TimeUnit.SECONDS.sleep(7);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        User user = new User("测试");

        resultDto.put(user);

        return resultDto;
    }

    @Override
    public ResultDto<User> saveUser(String userName) {
        ResultDto<User> resultDto = new ResultDto<>();

        User user = new User(userName);

        resultDto.setCode(3233);
        resultDto.put(user);

        return resultDto;
    }
}
