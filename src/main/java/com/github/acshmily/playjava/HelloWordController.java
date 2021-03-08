package com.github.acshmily.playjava;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Huanghz
 * @description: halo
 * @date:Created in 11:33 下午 2021/3/8
 * @modifyBy:
 **/
@RestController
@RequestMapping("hello")
public class HelloWordController {
    @RequestMapping
    public String hello(){
        return "hello world";
    }
}
