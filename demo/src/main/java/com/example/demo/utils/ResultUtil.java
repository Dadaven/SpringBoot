package com.example.demo.utils;


import com.example.demo.domain.Result;
/*
重复代码用工具类管理
 */
public class ResultUtil {
    public static Result success(Object object){
        Result result=new Result();
        result.setCode(0);
        result.setMessage("成功");
        result.setData(object);
        return  result;
    }
    public static Result success(){
        return success(null);
    }
    public static Result error(Integer code,String msg){
        Result result=new Result();
        result.setCode(code);
        result.setMessage(msg);
        result.setData(null);
        return  result;
    }
}
