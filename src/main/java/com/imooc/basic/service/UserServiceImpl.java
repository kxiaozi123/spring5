package com.imooc.basic.service;

import com.imooc.basic.dao.UserDao;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void login() {
       userDao.login();
       // System.out.println("login");
    }
}
