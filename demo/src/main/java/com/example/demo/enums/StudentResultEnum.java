package com.example.demo.enums;

public enum StudentResultEnum {
    UNKNOW_ERROR(-1,"系统未知错误"),
    SUCCESS(0,"成功"),
    MIN_10(100,"小于十岁"),
    MIN_16(101,"小于十六岁")
    ;

    StudentResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    private Integer code;
    private String msg;
}
