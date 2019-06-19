package com.migu.config;

import com.migu.filter.AccessFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zmy
 * @email 775817199@qq.com
 * @create 2019-06-17 18:19
 */
@Configuration
public class Config {

    @Bean
    public AccessFilter getAccessFilter(){
        return new AccessFilter();
    }
}
