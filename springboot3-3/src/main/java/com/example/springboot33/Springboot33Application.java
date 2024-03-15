package com.example.springboot33;

import com.example.springboot33.pojo.Bug;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot33Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(Springboot33Application.class, args);
        Bug bug = ioc.getBean(Bug.class);
        System.out.println(bug);
    }

}
