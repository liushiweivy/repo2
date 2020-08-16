package com.it.sim_library;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.it.sim_library.dao")
public class SimLibraryApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimLibraryApplication.class, args);
    }

}
