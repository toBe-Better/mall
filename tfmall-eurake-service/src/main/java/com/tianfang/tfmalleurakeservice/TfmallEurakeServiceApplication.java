package com.tianfang.tfmalleurakeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TfmallEurakeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TfmallEurakeServiceApplication.class, args);
    }

}
