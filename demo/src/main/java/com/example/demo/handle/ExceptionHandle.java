package com.example.demo.handle;

import com.example.demo.Exception.StudentException;
import com.example.demo.domain.Result;
import com.example.demo.utils.ResultUtil;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import org.slf4j.Logger;

@ControllerAdvice
public class ExceptionHandle {
    private  final static Logger logger= LoggerFactory.getLogger(ExceptionHandle.class);
    //捕获异常
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        if(e instanceof StudentException){
            StudentException studentException=(StudentException)e;
            return ResultUtil.error(studentException.getCode(),e.getMessage());
        }else {
            logger.error("[系统异常]{}",e);
            return ResultUtil.error(-1,"未知错误");
        }
    }
}
