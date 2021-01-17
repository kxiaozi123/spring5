package com.imooc.basic.aop.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;

public class TestCgLib {
    public static void main(String[] args) {
        ProductService productService=new ProductService();
        Enhancer enhancer=new Enhancer();
        enhancer.setClassLoader(TestCgLib.class.getClassLoader());
        enhancer.setSuperclass(productService.getClass());
        enhancer.setCallback((MethodInterceptor) (o, method, objects, methodProxy) -> {
            System.out.println("-------  cgLib  log------");
            return method.invoke(productService, objects);
        });
        ProductService productServiceProxy = (ProductService) enhancer.create();
        productServiceProxy.login();
        productServiceProxy.register();
    }
}
