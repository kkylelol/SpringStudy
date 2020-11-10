package com.kl.ssm.spring.bean;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    public static void main(String[] args) {

        //创建Spring容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");


//        通过
       Student s = (Student) ac.getBean("student");

       //使用对象
        System.out.println(s.toString());
    }
}
