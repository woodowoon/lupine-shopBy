package com.example.lupinediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class LupineDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(LupineDiscoveryApplication.class, args);
    }

}
