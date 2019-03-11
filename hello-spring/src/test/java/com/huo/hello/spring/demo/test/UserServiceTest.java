package com.huo.hello.spring.demo.test;

import com.huo.hello.spring.demo.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {

    private ApplicationContext context;

    @Before
    public void before() {
        context = new ClassPathXmlApplicationContext("spring-context.xml");
    }

    @Test
    public void testSay() {
        UserService userService = (UserService) context.getBean("userService");
        userService.hello();
    }
}
