package com.shop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.shop.dao")
public class SpYanwhProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpYanwhProviderApplication.class, args);
    }

}
