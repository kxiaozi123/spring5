package com.imooc.basic.aop.dao;

public class UserDaoImpl implements UserDao{
    @Override
    public void login() {
        System.out.println("访问数据库dao");
    }
}
