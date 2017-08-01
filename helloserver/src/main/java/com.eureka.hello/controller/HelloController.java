package com.eureka.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Taurin on 2017/7/28.
 */
@RestController
public class HelloController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/hello")
    public String index() {
        ServiceInstance serverInstance = discoveryClient.getLocalServiceInstance();
        System.out.print(serverInstance.getHost() + ",server id:" + serverInstance.getServiceId());
        return "Hello world";
    }
}
