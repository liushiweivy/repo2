package com.it.libregist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LibRegistApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibRegistApplication.class, args);
    }

}
