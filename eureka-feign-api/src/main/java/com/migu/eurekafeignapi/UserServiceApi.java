package com.migu.eurekafeignapi;

import com.migu.UserServiceFallbackFactory;
import com.migu.pojo.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zmy
 * @email 775817199@qq.com
 * @create 2019-06-17 16:12
 */
@FeignClient(value = "eureka-provider",fallbackFactory = UserServiceFallbackFactory.class)
public interface UserServiceApi {
    @RequestMapping("/getUser")
    User getUser();
}
