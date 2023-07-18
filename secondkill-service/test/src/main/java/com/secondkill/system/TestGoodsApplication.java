package com.secondkill.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.secondkill.api.*")
@MapperScan("com.secondkill.system.test.mapper")
@ComponentScan(basePackages={"com.secondkill"})
public class TestGoodsApplication {

    public static void main(String[] args) {

        SpringApplication.run(TestGoodsApplication.class, args);

    }

}
