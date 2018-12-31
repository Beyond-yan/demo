package com.beyond.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 闫波
 * @Date 2018/12/31 0031-14:32
 **/
@RestController
public class TestController {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello");
        return "hello";
    }
}
