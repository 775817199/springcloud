package com.migu.controller;

import com.migu.pojo.User;
import com.migu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zmy
 * @email 775817199@qq.com
 * @create 2019-06-17 14:17
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/listUser")
    @ResponseBody
    public List<User> listUser(){
        return userService.listUser();
    }

    @RequestMapping("/toAdd")
    public String toAddUser(){
        return "addUser";
    }

    @RequestMapping("/test")
    public void test(){
        System.out.println(111111111);
    }

}
