package com.migu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class EurekaFeignApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaFeignApiApplication.class, args);
    }

}
