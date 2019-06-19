package com.migu.service;

import com.migu.pojo.User;
import org.springframework.stereotype.Service;

/**
 * @author zmy
 * @email 775817199@qq.com
 * @create 2019-06-17 15:50
 */
@Service
public class UserServiceImpl implements UserService{

    @Override
    public User getUser() {
        return new User(1,"张三",18);
    }
}
