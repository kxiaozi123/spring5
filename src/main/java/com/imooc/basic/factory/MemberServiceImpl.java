package com.imooc.basic.factory;

public class MemberServiceImpl implements MemberService {
    @Override
    public void login() {
        System.out.println("MemberServiceImpl.login");
    }

    @Override
    public void register() {
        System.out.println("MemberServiceImpl.register");
    }
}
