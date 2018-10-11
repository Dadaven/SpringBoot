package com.example.demo.controller;

import com.example.demo.properties.MyProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Hellocontroller {

   @Autowired
   private MyProperties myProperties;//配置文件类
/*
Controller标注：相当于转发jsp界面的类
RestController是前后端分离的使用
 */

    @RequestMapping(value={"/hello/{id}","/hi/{id}"},method = RequestMethod.GET)
    public String saySomething(@PathVariable("id") Integer id){
        return "hello world!"+myProperties.getName()+myProperties.getAge()+"" +
                "获取url的值"+id;
    }

    @RequestMapping(value = "/nomalurl")
    public String testNomal(@RequestParam("id") Integer id){
        return "id:"+id;
    }


}
