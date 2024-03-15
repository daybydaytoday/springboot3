package com.example.springboot32.config;

import com.example.springboot32.pojo.Sheep;
import com.example.springboot32.pojo.User;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @Author: tooth-Decay
 * @Date: 2024/3/13 18:56
 * @Description TODO
 */
@Configuration
public class AppConfig {
    @Scope("singleton")
    @Bean
    public User getUser(){
        var user = new User();
        user.setName("tooth-Decay");
        user.setId("1");
        return user;
    }
}
