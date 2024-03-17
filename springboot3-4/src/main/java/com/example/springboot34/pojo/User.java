package com.example.springboot34.pojo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author: tooth-Decay
 * @Date: 2024/3/16 15:51
 * @Description TODO
 */
@Data
@AllArgsConstructor
@JacksonXmlRootElement  // 表示可以xml转换
public class User {
    private String name;
    private Integer age;

}
