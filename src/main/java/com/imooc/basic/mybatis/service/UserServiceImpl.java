package com.imooc.basic.mybatis.service;

import com.imooc.basic.mybatis.dao.UserDao;
import com.imooc.basic.mybatis.entity.User;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class UserServiceImpl implements UserService{
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void register(User user) {
        userDao.save(user);
        throw new RuntimeException("测试");
    }
}
