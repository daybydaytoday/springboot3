package com.example.springboot35thymeleaf.controller;

import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

/**
 * @Author: tooth-Decay
 * @Date: 2024/3/18 15:58
 * @Description TODO
 */
@RestController
public class MessageRestController {
    @Resource
    MessageSource messageSource;
    @GetMapping("/message")
    public String message(HttpServletRequest httpServletRequest) {
        Locale locale = httpServletRequest.getLocale();
        return messageSource.getMessage("home", null, locale);
    }
}
