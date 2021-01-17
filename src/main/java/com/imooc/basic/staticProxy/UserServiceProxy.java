package com.imooc.basic.staticProxy;

public class UserServiceProxy implements UserService{
    private UserServiceImpl userService=new UserServiceImpl();
    @Override
    public void register() {
        System.out.println("-------log------");
        userService.register();
    }

    @Override
    public void login() {
        System.out.println("-------log------");
        userService.login();
    }
}
