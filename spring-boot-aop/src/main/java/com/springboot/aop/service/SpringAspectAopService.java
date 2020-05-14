package com.springboot.aop.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author chenjie
 * @date 2020-05-14
 */
@Component
@Aspect
public class SpringAspectAopService {

    @Pointcut("execution(* com.springboot.aop.service.SpringAopService.test())")
    public void pointcut(){}

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("方法执行前");
        // 回调方法
        Object proceed = pjp.proceed();

        System.out.println("方法执行后");
        return proceed;
    }

}
