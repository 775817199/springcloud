package com.migu.controller;

import com.migu.pojo.User;
import com.migu.service.UserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zmy
 * @email 775817199@qq.com
 * @create 2019-06-17 15:51
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    //@HystrixCommand(fallbackMethod = "hystrixGetUser")
    @RequestMapping("/getUser")
    public User getUser(){
        System.out.println(222);
        int a = 0;
        if (a == 0){
            throw new RuntimeException("出错了");
        }
        return userService.getUser();
    }

    public User hystrixGetUser(){
        return new User(2,"ls",20);
    }
}
