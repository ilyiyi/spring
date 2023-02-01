package com.wak.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author wak
 */
@Component
@Aspect
public class TransactionAdvice {

    //定义通知，绑定切点和通知的关系
    @Before("pc()")
    public void before() {
        System.out.println("开启事务");
    }

    @After("pc()")
    public void after() {
        System.out.println("关闭事务");
    }

    @AfterReturning("pc()")
    public void afterReturning() {
        System.out.println("后置通知");
    }

    @AfterThrowing("pc()")
    public void afterThrowing() {
        System.out.println("异常通知");
    }

    @Around("pc()")
    public void around(ProceedingJoinPoint joinPoint) {

        try {
            System.out.println("前置通知");
            Object proceed = joinPoint.proceed();
            System.out.println("返回通知");
        } catch (Throwable e) {
            System.out.println("异常通知");
            e.printStackTrace();
        }
        System.out.println("环绕通知");
    }

    //定义切点
    @Pointcut("execution(void com.wak.service.impl.StudentServiceImpl.save(..))")
    public void pc() {
    }
}
