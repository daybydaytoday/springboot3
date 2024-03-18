package com.example.springboot35thymeleaf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: tooth-Decay
 * @Date: 2024/3/17 12:33
 * @Description TODO
 */
@Data
@AllArgsConstructor
public class User {
    private String name;
    private Integer age;

    public User() {
    }
}
