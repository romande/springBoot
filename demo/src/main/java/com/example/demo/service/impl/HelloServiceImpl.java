package com.example.demo.service.impl;

import com.example.demo.service.HelloService;
import com.example.demo.util.spring.ContextUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String getString() {
        return "the data is back from 'HelloService'";
    }

}
