package com.imooc.basic.aop.jdk;

import com.imooc.basic.aop.dynamic.OrderService;
import com.imooc.basic.aop.dynamic.OrderServiceImpl;

import java.lang.reflect.Proxy;

/**
 * JDK动态代理
 */
public class TestJdkProxy {
    public static void main(String[] args) {
        OrderService orderService=new OrderServiceImpl();
        OrderService orderServiceProxy = (OrderService) Proxy.newProxyInstance(TestJdkProxy.class.getClassLoader(), orderService.getClass().getInterfaces(), (proxy, method, args1) -> {
            System.out.println("-------  proxy  log------");
            return method.invoke(orderService, args1);
        });
        orderServiceProxy.login();
        orderServiceProxy.register();
    }
}
