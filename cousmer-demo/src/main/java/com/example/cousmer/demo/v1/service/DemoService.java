package com.example.cousmer.demo.v1.service;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
public class DemoService {

    @Resource
    private RestTemplate restTemplate;


    public String getDemo(String name){
        return restTemplate.getForObject("http://PRODUCER-DEMO/demo/test?name ="+name,String.class);
    }
}
