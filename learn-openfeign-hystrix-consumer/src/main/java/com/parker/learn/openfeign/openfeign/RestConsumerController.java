package com.parker.learn.openfeign.openfeign;

import com.parker.learn.api.ResultDto;
import com.parker.learn.api.dto.User;
import com.parker.learn.openfeign.openfeign.api.IUserApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
    private IUserApi iUserApi;


    @GetMapping("/getUser")
    public Result getUser() throws InterruptedException {
        Result result = new Result();
        ResultDto<User> dto = iUserApi.getUser();
        if(dto.isSuccess()){
            result.put("user",dto.get());
        }else{
            result.setMsg(dto.getMsg());
            result.setCode(dto.getCode());
        }
        return result;
    }

    @GetMapping("/saveUser")
    public Result saveUser(){
        Result result = new Result();
        ResultDto<User> dto = iUserApi.saveUser("保存用户");
        if(dto.isSuccess()){
            result.put("user",dto.get());
        }else{
            result.put("user",dto.get());
            result.setMsg(dto.getMsg());
            result.setCode(dto.getCode());
        }
        return result;
    }

}
