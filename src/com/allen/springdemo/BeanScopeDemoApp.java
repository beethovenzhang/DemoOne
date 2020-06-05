package com.allen.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        // load Spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // check if they are the same bean
        boolean result = (theCoach == alphaCoach);

        System.out.println("Same object: " + result);
        System.out.println("Memory address of theCoach: " + theCoach);
        System.out.println("Memory address of alphaCoach: " + alphaCoach);

        context.close();

    }
}
