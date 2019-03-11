package com.huo.hello.spring.demo;

import com.huo.hello.spring.demo.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        UserService hello = (UserService) context.getBean("userService");
        hello.hello();
    }
}
