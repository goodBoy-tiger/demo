package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
        System.out.println("我把刚刚创建的dev分支打印内容改了！");
        System.out.println("nihojj");
        System.out.println("又弄了一个分支");
    }

}
