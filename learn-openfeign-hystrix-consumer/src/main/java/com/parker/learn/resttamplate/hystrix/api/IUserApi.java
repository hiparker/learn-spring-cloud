package com.parker.learn.resttamplate.hystrix.api;

import com.parker.learn.api.UserApi;
import com.parker.learn.resttamplate.hystrix.api.callbackfactory.UserApiCallBackFactory;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @BelongsProject: learn-openfeign-consumer
 * @BelongsPackage: com.parker.learn.openfeign.openfeign.api
 * @Author: Parker
 * @CreateTime: 2020-09-05 00:48
 * @Description:
 */
@FeignClient(name = "provider", fallbackFactory = UserApiCallBackFactory.class)
public interface IUserApi extends UserApi {

}
