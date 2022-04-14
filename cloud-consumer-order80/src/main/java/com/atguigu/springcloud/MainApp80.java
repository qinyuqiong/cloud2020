package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author A
 * @date 2022/4/11
 */
@EnableEurekaClient
@SpringBootApplication
public class MainApp80 {

    public static void main(String[] args) {
        SpringApplication.run(MainApp80.class, args);
    }
}
