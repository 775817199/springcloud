package com.migu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.migu.mapper")
public class MicroservicecloudConfigDeptClient8001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudConfigDeptClient8001Application.class, args);
    }

}
