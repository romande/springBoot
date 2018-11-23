package com.example.demo.controller;

import com.example.demo.dao.entity.LoginUser;
import com.example.demo.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "index")
public class HelloController {

    @Resource
    HelloService helloService;

    @RequestMapping(value = "back")
    public LoginUser callBack(){
        LoginUser loginUser = new LoginUser();
        loginUser.setId(1);
        loginUser.setUserId(1);
        loginUser.setUserName("李易达");
        loginUser.setPassword("123456");
        return loginUser;
    }

    @RequestMapping(value = "hello")
    public String sayHello(){
        return helloService.getString();
    }

}
