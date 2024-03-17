package com.example.springboot34.controller;

import com.example.springboot34.pojo.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpRequest;

/**
 * @Author: tooth-Decay
 * @Date: 2024/3/16 15:11
 * @Description TODO
 */
@RestController
@Slf4j
public class PathController {
    // http://localhost:8080/abc/ab/aabb/a/b/c
    //a* : 以a开头的任意数目字符
    //a? : 以a开头的一个字符
    //路径变量name的值是 a,b任意个
    //** 任意层级目录，如果是PathPatternPaser那么这个只能放在最后。
    @GetMapping("/a*/a?/{name:[a-b]+}/**")
    public String path(HttpServletRequest request, @PathVariable("name") String name) {
        log.info("路径变量 name : {}", name);
        return "URL: " + request.getRequestURL().toString();
    }

    @GetMapping("/content")
    public User contentNegotiation() {
        return new User("x", 23);
    }

    public static void main(String[] args) {

        User x = new User("x", 23);
        //底层都是他在干事，记得那几个final变量都是和Mapper各种关联吗？
//        这些工厂也是有各种特性可以设置的
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        try {
            String s = objectMapper.writeValueAsString(x);
            System.out.println(s);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }
}
