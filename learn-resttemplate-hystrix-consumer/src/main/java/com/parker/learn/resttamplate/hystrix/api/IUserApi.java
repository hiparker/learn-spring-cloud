package com.parker.learn.resttamplate.hystrix.api;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.parker.learn.api.ResultDto;
import com.parker.learn.api.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

/**
 * @BelongsProject: learn-spring-cloud
 * @BelongsPackage: com.parker.learn.openfeign.openfeign.api
 * @Author: Parker
 * @CreateTime: 2020-09-08 22:43
 * @Description: TODO
 */
@Service
public class IUserApi {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(defaultFallback = "getHiBack")
    public String getHi() {
        // 自动处理URL
        String url ="http://provider/getHi";
        String object = restTemplate.getForObject(url, String.class);

        return object;
    }


    @HystrixCommand(fallbackMethod = "getUserBack")
    public ResultDto<User> getUser() {
        // 自动处理URL
        String url ="http://provider/users/getUser";
        ResultDto object = restTemplate.getForObject(url, ResultDto.class);

        return object;
    }

    @HystrixCommand(fallbackMethod = "saveUserBack")
    public ResultDto<User> saveUser(String username) {
        // 自动处理URL
        String url ="http://provider/users/saveUser";
        ResultDto object = restTemplate.getForObject(url, ResultDto.class,username);
        return object;
    }


    /**
     * 熔断回调
     * @return
     */

    public ResultDto<User> getUserBack(){
        ResultDto<User> resultDto = new ResultDto<>();
        resultDto.setSuccess(false);
        resultDto.setCode(7552);
        resultDto.setMsg("熔断了！！！！");
        return resultDto;
    }

    public ResultDto<User> saveUserBack(String username){
        ResultDto<User> resultDto = new ResultDto<>();
        resultDto.setSuccess(false);
        resultDto.setCode(7552);
        resultDto.setMsg("熔断了！！！！");
        resultDto.put(new User("兜底数据"+username));
        return resultDto;
    }

    public String  getHiBack(){
        return "熔断了";
    }

}
