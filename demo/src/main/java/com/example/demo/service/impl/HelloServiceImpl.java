package com.example.demo.service.impl;

import com.example.demo.service.HelloService;
import com.example.demo.util.Internet.RestUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class HelloServiceImpl implements HelloService {

    @Resource
    private RestUtil restUtil;

    @Override
    public String getString() {
        restUtil.doGET();
        return "the data is back from 'HelloService'";
    }

}
