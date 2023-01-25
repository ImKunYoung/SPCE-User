package com.example.spceuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpceUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpceUserApplication.class, args);
    }

}
