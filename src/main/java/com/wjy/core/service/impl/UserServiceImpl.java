package com.wjy.core.service.impl;

import com.wjy.core.domain.User;
import com.wjy.core.mapper.UserMapper;
import com.wjy.core.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    public User selectUser(long userId) {
        return this.userMapper.selectUser(userId);
    }

}