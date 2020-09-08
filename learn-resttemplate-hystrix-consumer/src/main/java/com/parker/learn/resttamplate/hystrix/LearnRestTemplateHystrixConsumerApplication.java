package com.parker.learn.resttamplate.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class LearnRestTemplateHystrixConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnRestTemplateHystrixConsumerApplication.class, args);
    }

}
