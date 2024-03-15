package com.example.springboot32.config;

import com.example.springboot32.pojo.Cat;
import com.example.springboot32.pojo.Dog;
import com.example.springboot32.pojo.Sheep;
import com.example.springboot32.pojo.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnSingleCandidate;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * @Author: tooth-Decay
 * @Date: 2024/3/13 19:17
 * @Description TODO
 */

@Configuration
public class AppConfig2 {
    @ConditionalOnClass(name = "com.alibaba.druid.FastsqlException")
    @Bean
    public Dog wangcai(){
        Dog dog = new Dog();
        dog.setName("旺财");
        return dog;
    }
    @ConditionalOnMissingClass(value = "com.alibaba.druid.FastsqlException")
    @Bean
    public Cat jiba(){
        Cat cat = new Cat();
        cat.setName("急巴猫");
        return cat;
    }
    @ConditionalOnClass(name = "com.example.springboot32.pojo.Dog")
    @Bean
    public User zhangsan(){
        User user = new User();
        user.setName("张三");
        return user;
    }
    @ConditionalOnClass(name = "com.example.springboot32.pojo.Cat")
    @Bean
    public User lisi(){
        User user = new User();
        user.setName("李四");
        return user;
    }


}
