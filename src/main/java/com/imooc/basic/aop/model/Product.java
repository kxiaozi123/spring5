package com.imooc.basic.aop.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Product  implements InitializingBean, DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Product.afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Product.destroy");
    }
    public void myInit()
    {
        System.out.println("Product.myInit");
    }
    public void myDestroy()
    {
        System.out.println("Product.myDestroy");
    }

}
