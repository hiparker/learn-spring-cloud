package com.parker.learn.resttamplate.hystrix.api.callback;

import com.parker.learn.api.ResultDto;
import com.parker.learn.api.dto.User;
import com.parker.learn.resttamplate.hystrix.api.IUserApi;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: learn-spring-cloud
 * @BelongsPackage: com.parker.learn.openfeign.openfeign.api.callback
 * @Author: Parker
 * @CreateTime: 2020-09-07 19:10
 * @Description: UserApi Hystrix 异常处理
 *
 * 注意 callback  实现的 是当前的 IUserApi
 *
 */
@Component
public class UserApiCallBack implements IUserApi {

    @Override
    public ResultDto<User> getUser() {

        ResultDto<User> resultDto = new ResultDto<>();
        resultDto.setSuccess(false);
        resultDto.setCode(7552);
        resultDto.setMsg("熔断了！！！！");

        return resultDto;
    }

    @Override
    public ResultDto<User> saveUser(String userName) {
        ResultDto<User> resultDto = new ResultDto<>();
        resultDto.setSuccess(false);
        resultDto.setCode(7552);
        resultDto.setMsg("熔断了！！！！");
        resultDto.put(new User("兜底数据"));
        return resultDto;
    }
}
