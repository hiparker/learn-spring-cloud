package com.parker.learn.resttamplate.hystrix;

import com.parker.learn.api.ResultDto;
import com.parker.learn.api.dto.User;
import com.parker.learn.resttamplate.hystrix.api.ConsumerApiBySingle;
import com.parker.learn.resttamplate.hystrix.api.IUserApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: learn-openfeign-consumer
 * @BelongsPackage: com.parker.learn.openfeign.openfeign
 * @Author: Parker
 * @CreateTime: 2020-09-05 00:38
 * @Description: TODO
 */

@RestController
@RequestMapping("/v2/api")
public class RestConsumerController {

    @Autowired
    private ConsumerApiBySingle consumerApiBySingle;

    //@Autowired
    //private ConsumerApi consumerApi;

    @Autowired
    private IUserApi iUserApi;

    /**
     * 单独 调用
     * @return
     */
    @GetMapping("getHi1")
    public Result getHi1(){
        String hi = consumerApiBySingle.getHi();
        return Result.success(hi);
    }

    /**
     * 负载调用
     * @return
     */
//    @GetMapping("getHi2")
//    public Result getHi2(){
//        String hi = consumerApi.getHi();
//        return Result.success(hi);
//    }


    @GetMapping("/getUser")
    public Result getUser() throws InterruptedException {
        Result result = new Result();
        ResultDto<User> dto = iUserApi.getUser();
        result.put("user",dto.get());
        return result;
    }

    @GetMapping("/saveUser")
    public Result saveUser(){
        Result result = new Result();
        ResultDto<User> dto = iUserApi.saveUser("保存用户");
        result.put("user",dto.get());
        return result;
    }

}
