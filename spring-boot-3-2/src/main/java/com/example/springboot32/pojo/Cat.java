package com.example.springboot32.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: tooth-Decay
 * @Date: 2024/3/13 19:15
 * @Description TODO
 */

@ConfigurationProperties(prefix = "cat")
@Component
public class Cat {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
