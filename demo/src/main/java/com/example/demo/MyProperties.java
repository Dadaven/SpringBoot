package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
/*
配置文件类
注入配置
 */
@Component
@ConfigurationProperties(prefix = "myconfig")
public class MyProperties {
    private String name;
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    private  Integer age;
}
