package com.diwu.cjj.helloapi.controller;

import com.diwu.cjj.helloapi.pojo.Result;
import com.diwu.cjj.helloapi.pojo.User;
import com.diwu.cjj.helloapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/login")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 登录方法
     * @param username
     * @param password
     * @return
     */
    @PostMapping
    public Result login(String username, String password){
        User user = userService.login(username,password);
        return Result.success(user);
    }
}
