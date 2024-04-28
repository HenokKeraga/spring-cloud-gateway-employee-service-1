package com.woinhen.employerserviceapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EmployerServiceApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployerServiceApiGatewayApplication.class, args);
    }

}
