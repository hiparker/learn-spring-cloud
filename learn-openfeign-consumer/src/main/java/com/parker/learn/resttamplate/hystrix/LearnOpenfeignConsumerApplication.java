package com.parker.learn.resttamplate.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LearnOpenfeignConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnOpenfeignConsumerApplication.class, args);
    }

}
