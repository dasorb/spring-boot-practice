package com.springboot.aop.service;

import com.springboot.aop.SpringAopApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author chenjie
 * @date 2020-05-14
 */
public class TestMainService {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringAopApplication.class);

        SpringAopService bean = context.getBean(SpringAopService.class);
        bean.test();

    }


}
