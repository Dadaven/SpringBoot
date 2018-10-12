package com.example.demo;

import com.example.demo.domain.Student;
import com.example.demo.service.StudentService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentServiceTest {

    @Autowired
    private StudentService studentService;

    @Test
    public void findOneTest(){
       Student student=studentService.findOne(10);
        Assert.assertEquals(new Integer(22),student.getAge());
    }
}
