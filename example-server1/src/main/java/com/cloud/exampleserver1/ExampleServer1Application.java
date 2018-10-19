package com.cloud.exampleserver1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
public class ExampleServer1Application {
    public static void main(String[] args) {
        SpringApplication.run(ExampleServer1Application.class, args);
    }
}
