package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EntityScan("com.app.repository.entity")
public class MyRestApp {

    public static void main(String[] args) {
        SpringApplication.run(MyRestApp.class, args);
    }

}
