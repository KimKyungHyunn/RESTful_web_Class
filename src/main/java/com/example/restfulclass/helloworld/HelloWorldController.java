package com.example.restfulclass.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class HelloWorldController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello";
    }

    //return type 없으면 자동으로 json 형식으로 return
    @GetMapping(path = "/hello-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("HelloWorldBean");
    }

    @GetMapping(path = "/hello-bean/path-variable/{name}")
    public HelloWorldBean helloWorldBean(@PathVariable String name){
        return new HelloWorldBean(String.format("HelloWorldBean, %s", name));
    }

    @GetMapping(path= "/hello-world-internationalized")
    public String helloWorldInternationalized(@RequestHeader(name="Accept-Language",
    required = false) Locale locale){
        return messageSource.getMessage("greeting.message", null, locale);
    }


}
