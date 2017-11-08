package com.eureka.store.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Taurin on 2017/11/8.
 */
@Service
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "failCallback")
    public String helloService() {
        return restTemplate.getForEntity("http://api-gateway/hello-server/hello?token={1}", String.class, "test token").getBody();
    }

    public String failCallback() {
        return "error";
    }
}
