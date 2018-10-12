package com.example.demo.service;

import com.example.demo.Exception.StudentException;
import com.example.demo.enums.StudentResultEnum;
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
/*
验证不通过就跑出异常
 */
    public void getAge(Integer id) throws Exception{
        Student student=studentRepository.findOne(id);
        Integer age=student.getAge();
        if(age<10){
            throw new StudentException(StudentResultEnum.MIN_10);
        }else if(age>=10&&age<16){
            throw new StudentException(StudentResultEnum.MIN_16);
        }
    }
/*
通过id查询一个学生
 */
    public Student findOne(Integer id){
        return studentRepository.findOne(id);
    }
}
