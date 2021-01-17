package com.imooc.basic.dynamic;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class Around  implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("-----额外功能 log----");
        Object ret = methodInvocation.proceed();
        System.out.println("-----额外功能运⾏在原始⽅法执⾏之后----");
        return ret;
    }
}
