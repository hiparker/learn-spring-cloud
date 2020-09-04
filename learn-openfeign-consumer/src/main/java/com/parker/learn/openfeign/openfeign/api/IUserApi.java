package com.parker.learn.openfeign.openfeign.api;

import com.parker.learn.api.UserApi;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @BelongsProject: learn-openfeign-consumer
 * @BelongsPackage: com.parker.learn.openfeign.openfeign.api
 * @Author: Parker
 * @CreateTime: 2020-09-05 00:48
 * @Description:
 */
@FeignClient(name = "provider")
public interface IUserApi extends UserApi {

}
