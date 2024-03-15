package com.example.springboot33.pojo;

import lombok.Data;

/**
 * @Author: tooth-Decay
 * @Date: 2024/3/15 14:03
 * @Description TODO
 */
@Data
public class Food {
    private String foodName;

    @Override
    public String toString() {
        return "Food{" +
                "foodName='" + foodName + '\'' +
                '}';
    }
}
