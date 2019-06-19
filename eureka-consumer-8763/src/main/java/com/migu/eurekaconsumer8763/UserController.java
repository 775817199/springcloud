package com.migu.eurekaconsumer8763;

import com.migu.eurekafeignapi.UserServiceApi;
import com.migu.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author zmy
 * @email 775817199@qq.com
 * @create 2019-06-17 16:14
 */
@RestController
public class UserController {

    @Autowired
    private UserServiceApi userServiceApi;

    @RequestMapping("/getUser")
    public User getUser(){
        return userServiceApi.getUser();
    }
}
