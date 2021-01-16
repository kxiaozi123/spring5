package com.imooc.basic;

import com.imooc.basic.service.UserService;

public class Test {
    public static void main(String[] args) {
        UserService service = (UserService) BeanFactory.getBean("service");
        service.login();
    }
}
