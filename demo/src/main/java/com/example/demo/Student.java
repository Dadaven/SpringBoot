package com.example.demo;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Student {
    //jpa自动映射数据库表

    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return id;
    }

    public void setNumber(Integer number) {
        this.id = number;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }


    private Integer age;
    private String hobby;
}
