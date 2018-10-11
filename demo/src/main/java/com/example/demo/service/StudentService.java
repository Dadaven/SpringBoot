package com.example.demo.service;

import com.example.demo.repository.StudentRepository;
import com.example.demo.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class StudentService {


    @Autowired
    private StudentRepository studentRepository;

    @Transactional//原子事务，只有查询不需要加事务
    public void inserTow(){
        Student student=new Student();
        Student student1=new Student();

        student.setName("花花");
        student.setAge(12);
        student.setHobby("唱歌");
        studentRepository.save(student);
        student1.setName("贝贝");
        student1.setAge(30);
        student1.setHobby("游戏");
        studentRepository.save(student1);

    }
}
