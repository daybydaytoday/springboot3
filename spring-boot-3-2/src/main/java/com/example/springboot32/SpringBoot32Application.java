package com.example.springboot32;

import com.example.springboot32.pojo.Cat;
import com.example.springboot32.pojo.Dog;
import com.example.springboot32.pojo.Sheep;
import com.example.springboot32.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

@EnableConfigurationProperties(Sheep.class)

@SpringBootApplication
public class SpringBoot32Application {

    public static void main(String[] args) {
        var ioc_context = SpringApplication.run(SpringBoot32Application.class, args); // IOC容器
//        for (String beanDefinitionName : ioc_context.getBeanDefinitionNames()) { // 获取容器内的IOC组件的名字,自动配置的
//            System.out.println(beanDefinitionName);//容器中有默认定义好的组件或者导入场景启动器就会自动生成组件,提供相关功能
//        }
        Dog wangcai = (Dog)ioc_context.getBean("wangcai");
        User zhangsan = (User)ioc_context.getBean("zhangsan");
        System.out.println(wangcai.getName());
        System.out.println(zhangsan.getName());

        Cat cat = ioc_context.getBean(Cat.class);
        System.out.println(cat.getName());

        Sheep sheep = ioc_context.getBean(Sheep.class);
        System.out.println(sheep.getName());

    }
}
