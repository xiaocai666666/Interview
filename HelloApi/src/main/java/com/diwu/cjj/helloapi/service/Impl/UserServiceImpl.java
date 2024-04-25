package com.diwu.cjj.helloapi.service.Impl;

import com.diwu.cjj.helloapi.mapper.UserMapper;
import com.diwu.cjj.helloapi.pojo.User;
import com.diwu.cjj.helloapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 登录方法
     * @param username
     * @param password
     * @return
     */
    @Override
    public User login(String username, String password) {
        User user = userMapper.login(username,password);
        return user;
    }
}
