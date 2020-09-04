package com.parker.learn.openfeign.openfeign;

import com.parker.learn.api.vo.User;
import com.parker.learn.openfeign.openfeign.api.ConsumerApi;
import com.parker.learn.openfeign.openfeign.api.ConsumerApiBySingle;
import com.parker.learn.openfeign.openfeign.api.IUserApi;
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
    public Result getUser(){
        Result result = new Result();
        User user = iUserApi.getUser();
        result.put("user",user);
        return result;
    }

    @GetMapping("/saveUser")
    public Result saveUser(){
        Result result = new Result();
        User user = iUserApi.saveUser("保存用户");
        result.put("user",user);
        return result;
    }

}
