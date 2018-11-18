package com.example.demo.service.impl;

import com.example.demo.dao.entity.LoginUser;
import com.example.demo.dao.mapper.LoginUserMapper;
import com.example.demo.service.LoginUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginUserServiceImpl implements LoginUserService {

    @Resource
    private LoginUserMapper userMapper;

    @Override
    public LoginUser getOne(Integer id) {
        return userMapper.get(id);
    }
}
