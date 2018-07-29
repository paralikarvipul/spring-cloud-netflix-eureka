package com.example.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("eureka-client")
public interface HelloWorldInterface {
    @RequestMapping("/helloworld")
    String helloWorld();
}
