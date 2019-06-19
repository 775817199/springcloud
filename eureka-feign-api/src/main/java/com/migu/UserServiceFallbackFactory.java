package com.migu;

import com.migu.eurekafeignapi.UserServiceApi;
import com.migu.pojo.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zmy
 * @email 775817199@qq.com
 * @create 2019-06-17 17:46
 */
@Component
public class UserServiceFallbackFactory implements FallbackFactory<UserServiceApi> {

    @Override
    public UserServiceApi create(Throwable throwable) {
        UserServiceApi userServiceApi = new UserServiceApi() {
            @Override
            public User getUser() {
                return new User(3,"ww",21);
            }
        };
        return userServiceApi;
    }
}
