package com.example.restfulclass.helloworld;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class HelloWorldBean {
    private String message;

//AllArgsConstructor로 클래스 내에 모든 필드에 대한 생성자 자동 생성
//    public HelloWorldBean(String message) {
//        this.message = message;
//    }
}
