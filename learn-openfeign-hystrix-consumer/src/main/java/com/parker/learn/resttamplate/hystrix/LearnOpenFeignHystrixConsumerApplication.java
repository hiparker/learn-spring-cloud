package com.parker.learn.resttamplate.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LearnOpenFeignHystrixConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnOpenFeignHystrixConsumerApplication.class, args);
    }

}
