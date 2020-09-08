package com.parker.learn.resttamplate.hystrix.api.callbackfactory;

import com.netflix.hystrix.exception.HystrixTimeoutException;
import com.parker.learn.api.ResultDto;
import com.parker.learn.api.UserApi;
import com.parker.learn.api.dto.User;
import feign.hystrix.FallbackFactory;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: learn-spring-cloud
 * @BelongsPackage: com.parker.learn.openfeign.openfeign.api.callbackfactory
 * @Author: Parker
 * @CreateTime: 2020-09-08 22:27
 * @Description: TODO
 */
@Component
public class UserApiCallBackFactory implements FallbackFactory<UserApi> {
    @Override
    public UserApi create(Throwable e) {
        return new UserApi() {
            @Override
            public ResultDto<User> getUser() {
                ResultDto<User> resultDto = new ResultDto<>();

                if(e instanceof HystrixTimeoutException){
                    resultDto.setSuccess(false);
                    resultDto.setCode(404);
                    resultDto.setMsg("超时 - 熔断了！！！！");
                }else{
                    resultDto.setSuccess(false);
                    resultDto.setCode(7552);
                    resultDto.setMsg("熔断了！！！！");
                }

                System.out.println(e);
                System.out.println(ToStringBuilder.reflectionToString(e));
                System.out.println("错误信息：" + e.getLocalizedMessage());

                return resultDto;
            }

            @Override
            public ResultDto<User> saveUser(String userName) {
                System.out.println("错误信息：" + e.getMessage());

                ResultDto<User> resultDto = new ResultDto<>();
                resultDto.setSuccess(false);
                resultDto.setCode(7552);
                resultDto.setMsg("熔断了！！！！");
                resultDto.put(new User("兜底数据"));
                return resultDto;
            }
        };
    }
}
