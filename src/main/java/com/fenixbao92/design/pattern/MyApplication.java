package com.fenixbao92.design.pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Create by fenixbao92 on 2019/3/13.
 */

@SpringBootApplication
public class MyApplication {
    public static void main(String[] args){
        SpringApplication.run(MyApplication.class, args);
        System.out.println("启动成功");
    }
}
