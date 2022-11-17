package com.itheima.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 作者：lihaiming
 * 时间：2022/11/5-23:38
 */
@RestController
public class HelloController {


    @Value("${student[0].name}")
    private String name;

    @RequestMapping("/hello")
    public String hello() {
        System.out.println(name);
        return "hello world";
    }
}
