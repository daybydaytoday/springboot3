package com.example.springboot36errormvcautoconfigureration.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: tooth-Decay
 * @Date: 2024/3/18 16:17
 * @Description TODO
 */
@RestController
public class WellController {
    @GetMapping("/well")
    public String well() {
        int i = 1 / 0;
        return "well";
    }

//    @ExceptionHandler(Exception.class) // 能处理的异常类型
//    public String handleException(Exception e) { // 有异常会被捕捉到交给 e
//        String msg = "hehe \n";
//        return msg + e.getMessage();
//    }
}
