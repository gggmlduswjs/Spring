package com.acorn.di.calculator;

import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanLister {

    @Autowired
    private ApplicationContext context;

    public void listBeans() {
        String[] beanNames = context.getBeanDefinitionNames();
        System.out.println("등록된 빈 목록:");
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }
}

