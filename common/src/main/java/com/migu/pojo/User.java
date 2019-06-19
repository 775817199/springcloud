package com.migu.pojo;

import lombok.Data;

/**
 * @author zmy
 * @email 775817199@qq.com
 * @create 2019-06-17 15:10
 */
@Data
public class User {

    private Integer id;
    private String name;
    private Integer age;

    public User(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    //aaa
}
