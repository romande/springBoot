package com.example.demo.controller;

import com.example.demo.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "index")
public class HelloController {

    @Resource
    HelloService helloService;

    @RequestMapping(value = "hello")
    public String sayHello(){
        return helloService.getString();
    }

}
