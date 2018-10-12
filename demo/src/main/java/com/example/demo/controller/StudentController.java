package com.example.demo.controller;

import com.example.demo.domain.Result;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import com.example.demo.domain.Student;
import com.example.demo.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentService studentService;

    /*
    查询所有学生列表
     */
    @GetMapping(value = "/students")
    public List<Student> studentList(){
         return  studentRepository.findAll();
    }
    /*
    新增一个学生
     */
    @GetMapping(value = "/add")
    public Result<Student> oneStudent(@Valid Student student, BindingResult bindingResult){
        if(bindingResult.hasErrors()){

            return ResultUtil.error(1,bindingResult.getFieldError().getDefaultMessage());
        }
         student.setName(student.getName());
         student.setAge(student.getAge());
         student.setHobby(student.getHobby());
        return ResultUtil.success(studentRepository.save(student));
    }
    /*
    通过age方式查询一个学生信息
     */
    @GetMapping(value = "/students/age/{age}")
    public List<Student> findByAge(@PathVariable("age") Integer age){
          return  studentRepository.findByAge(age);
    }

    /*
    通过id方式查询一个学生信息
     */
    @GetMapping(value = "/students/{id}")
    public Student findOne(@PathVariable("id") Integer id){
        return  studentRepository.findOne(id);
    }
    /*
    更新
     */
    @GetMapping(value = "/updata/{id}")
    public Student updataStudnt(@PathVariable("id") Integer id,
                                @RequestParam("name") String name,
                                @RequestParam("age") Integer age,
                                @RequestParam("hobby") String hobby){
        Student student=new Student();
        student.setNumber(id);
        student.setName(name);
        student.setAge(age);
        student.setHobby(hobby);
        return studentRepository.save(student);
    }
    /*
    删除
     */
      @GetMapping(value = "/del/{id}")
    public void deleteOne(@PathVariable("id") Integer id){
          studentRepository.delete(id);
      }


      @GetMapping(value = "students/inserttwo")
      public void insertTwo(){
         studentService.inserTow();
      }

      @GetMapping(value = "/getAge/{id}")
    public void getAge(@PathVariable("id") Integer id) throws Exception{
             studentService.getAge(id);
      }
}
