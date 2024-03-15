package com.example.springboot32.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @Author: tooth-Decay
 * @Date: 2024/3/13 20:03
 * @Description TODO
 */


@ConfigurationProperties(prefix = "sheep")
public class Sheep {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
