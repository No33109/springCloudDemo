package com.example.producer.demo.v1.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {


    @RequestMapping("/test/{name}")
    public String demoTest(@PathVariable("name")String name){
        return name+" is working";
    }
}
