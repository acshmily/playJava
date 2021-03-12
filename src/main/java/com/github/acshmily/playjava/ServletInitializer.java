package com.github.acshmily.playjava;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @Author: Huanghz
 * @description: tomcat need
 * @date:Created in 11:10 上午 2021/3/12
 * @modifyBy:
 **/
public class ServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(PlayJavaApplication.class);
    }
}
