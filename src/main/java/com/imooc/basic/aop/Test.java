package com.imooc.basic.aop;

import com.imooc.basic.aop.service.UserService;

public class Test {
    public static void main(String[] args) {
        UserService service = (UserService) BeanFactory.getBean("service");
        service.login();
    }
}
