package com.example.demo.Exception;

import com.example.demo.enums.StudentResultEnum;

public class StudentException extends RuntimeException{
    public Integer getCode() {
        return code;
    }


    public StudentException(StudentResultEnum studentResultEnum) {
        super(studentResultEnum.getMsg());
        this.code = studentResultEnum.getCode();
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    private Integer code;//异常错误类型码
}
