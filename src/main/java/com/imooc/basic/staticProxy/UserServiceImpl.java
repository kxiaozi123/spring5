package com.imooc.basic.staticProxy;

public class UserServiceImpl  implements  UserService{
    @Override
    public void register() {
        System.out.println("UserServiceImpl.register");
    }

    @Override
    public void login() {
        System.out.println("UserServiceImpl.login");
    }
}
