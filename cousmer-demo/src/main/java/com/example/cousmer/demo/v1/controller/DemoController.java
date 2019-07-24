package com.example.cousmer.demo.v1.controller;


import com.example.cousmer.demo.v1.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/demo")
public class DemoController {


    @Resource
    private DemoService demoService;


    @RequestMapping("/get")
    public String demoGet(){
        return demoService.getDemo("lrz");
    }
}
