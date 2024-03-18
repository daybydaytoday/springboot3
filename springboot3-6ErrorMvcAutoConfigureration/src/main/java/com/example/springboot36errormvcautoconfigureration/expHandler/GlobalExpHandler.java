package com.example.springboot36errormvcautoconfigureration.expHandler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author: tooth-Decay
 * @Date: 2024/3/18 16:25
 * @Description TODO
 */
//@RestControllerAdvice // 集中处理所有的controller的异常错误
//public class GlobalExpHandler {
//    @ExceptionHandler(Exception.class) // 能处理的异常类型
//    public String handleException(Exception e) { // 有异常会被捕捉到交给 e
//        String msg = "统一异常处理 :  hehe \n";
//        return msg + e.getMessage();
//    }
//}
