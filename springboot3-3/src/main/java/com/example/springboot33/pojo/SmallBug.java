package com.example.springboot33.pojo;

import lombok.Data;

/**
 * @Author: tooth-Decay
 * @Date: 2024/3/15 14:02
 * @Description TODO
 */
@Data
public class SmallBug {
    private Integer age;
    private String name;


    private Food likeFood;

    @Override
    public String toString() {
        return "SmallBug{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", likeFood=" + likeFood +
                '}';
    }
}
