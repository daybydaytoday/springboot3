package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: tooth-Decay
 * @Date: 2024/3/12 7:42
 * @Description TODO
 */
@RestController
@RequestMapping("/h")
public class HelloController {
    @GetMapping
    public String hello(){
        return "Hello World!";
    }
}
