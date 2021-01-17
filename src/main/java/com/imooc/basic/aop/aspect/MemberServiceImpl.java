package com.imooc.basic.aop.aspect;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MemberServiceImpl implements MemberService, ApplicationContextAware {
    private ApplicationContext applicationContext;

    @Override
    public void login() {
        System.out.println("MemberServiceImpl.login");
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
        memberService.register();
    }

    @Override
    public void register() {
        System.out.println("MemberServiceImpl.register");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }
}
