package com.migu.service;

import com.migu.mapper.UserMapper;
import com.migu.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zmy
 * @email 775817199@qq.com
 * @create 2019-06-17 14:11
 */
@Service
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> listUser() {
        return userMapper.listUser();
    }
}
