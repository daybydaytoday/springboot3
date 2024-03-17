package com.example.springboot34.config;

import com.example.springboot34.component.MyYamlMessageConvertor;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @Author: tooth-Decay
 * @Date: 2024/3/16 14:08
 * @Description TODO
 */
@Configuration
public class MyWebMvcConfigueration implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //TODO 手自一体的方式，保留默认配置的同时
        WebMvcConfigurer.super.addResourceHandlers(registry);
        // TODO 写自己的配置
        // 所以下面的代码的意思就是访问 /static/**  就能访问 x,y,z下的静态资源
        registry.addResourceHandler("/static/**")  // 静态资源路径的访问规则
                .addResourceLocations("classpath:/x/","classpath:/y/","classpath:/z/") //静态资源库
                .setCacheControl(CacheControl.maxAge(9999L, TimeUnit.SECONDS));  // 配置缓存失效时间为9999秒
    }

    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
     // TODO 添加进去自己写的
       converters.add(new MyYamlMessageConvertor());
    }
}
