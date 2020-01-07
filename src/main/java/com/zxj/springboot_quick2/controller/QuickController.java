package com.zxj.springboot_quick2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class QuickController {

    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private Integer age;
    @RequestMapping("/quick2")
    public String quick(){
        return "springboot 访问成功! name="+name+",age="+age;
    }

}
