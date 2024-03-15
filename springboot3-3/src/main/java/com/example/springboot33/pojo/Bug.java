package com.example.springboot33.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @Author: tooth-Decay
 * @Date: 2024/3/15 13:59
 * @Description TODO
 */

@Data
//成为容器中的组件并进配置属性绑定
@Component
@ConfigurationProperties(prefix = "bug")
public class Bug {
    private Integer bugAge;
    private String bugName;
    private Boolean death;
    private Double bugWeight;
    private SmallBug smallBug;
    private List<SmallBug> army;
    private Map<String, SmallBug> note;
    private SmallBug[] smallBugs;

    @Override
    public String toString() {
        return "Bug{" +
                "bugAge=" + bugAge +
                ", bugName='" + bugName + '\'' +
                ", death=" + death +
                ", bugWeight=" + bugWeight +
                ", smallBug=" + smallBug +
                ", army=" + army +
                ", note=" + note +
                ", smallBugs=" + Arrays.toString(smallBugs) +
                '}';
    }
}
