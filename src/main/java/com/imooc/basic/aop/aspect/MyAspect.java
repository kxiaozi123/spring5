package com.imooc.basic.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {
    @Around(value = "myPointCut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("aspect Log-----");
        return joinPoint.proceed();
    }

    /**
     * 切入点复用
     */
    @Pointcut("execution(* *..MemberServiceImpl.* (..))")
    public void myPointCut()
    {

    }
}
