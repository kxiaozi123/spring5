package com.imooc.basic.dynamic;

import com.imooc.basic.Log;

public class OrderServiceImpl implements OrderService{
    @Override
    public void login() {
        System.out.println("OrderServiceImpl.login");
    }

    @Override
    public void register() {
        System.out.println("OrderServiceImpl.register");
    }
}
