package com.eureka.store.controller;

import com.eureka.store.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

/**
 * Created by Taurin on 2017/7/28.
 */
@RestController
public class CustomerController {

    @Autowired
    HelloService helloService;

    @RequestMapping("/hello")
    public String hello() {
        return helloService.helloService();
    }

    @RequestMapping("/test")
    public String test() {
        return "test part";
    }


//    @Scheduled(fixedRate = 1000)
//    public void scheduleMethod() {
//        System.out.println("current date: " + new Date());
//    }
}
