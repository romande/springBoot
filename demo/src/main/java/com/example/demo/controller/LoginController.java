package com.example.demo.controller;

import com.example.demo.dao.entity.LoginUser;
import com.example.demo.service.LoginUserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "login")
public class LoginController {

    @Resource
    private LoginUserService loginUserService;

    @RequestMapping(value = "user/{id}")
    public LoginUser sayHello(@PathVariable("id") Integer id){
        return loginUserService.getOne(id);
    }
}
