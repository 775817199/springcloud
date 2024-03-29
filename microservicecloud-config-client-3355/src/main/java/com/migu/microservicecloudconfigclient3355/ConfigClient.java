package com.migu.microservicecloudconfigclient3355;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zmy
 * @email 775817199@qq.com
 * @create 2019-06-18 15:44
 */
@RestController
public class ConfigClient {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.com.migu.service-url.defaultZone}")
    private String eurekaServers;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/config")
    public String getConfig(){
        String str = "applicationName: " + applicationName + "\t eurekaServers:" + eurekaServers + "\t port: " + port;
        System.out.println("******str: " + str);
        return "applicationName: " + applicationName + "\t eurekaServers:" + eurekaServers + "\t port: " + port;
    }
}
