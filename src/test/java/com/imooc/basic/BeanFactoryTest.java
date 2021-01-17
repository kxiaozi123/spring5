package com.imooc.basic;

import com.imooc.basic.aop.aspect.MemberService;
import com.imooc.basic.aop.dynamic.OrderService;
import com.imooc.basic.aop.model.Product;
import com.imooc.basic.mybatis.dao.UserDao;
import com.imooc.basic.mybatis.entity.User;
import com.imooc.basic.mybatis.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;

public class BeanFactoryTest {

    @Test
    public void testSpring() {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("/aop/applicationContext.xml");
        //Person person = (Person) ctx.getBean("person");
        //Person person = ctx.getBean("person", Person.class);
        //Person person = ctx.getBean(Person.class);
//        String[] names = ctx.getBeanDefinitionNames();
//        for (String name : names) {
//            System.out.println(name);
//        }
//        String[] beanNamesForType = ctx.getBeanNamesForType(Person.class);
//        for (String s : beanNamesForType) {
//            System.out.println(s);
//        }
        //System.out.println(ctx.containsBeanDefinition("person3"));
        //System.out.println(ctx.containsBean("person1"));
//        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
//        for (String beanDefinitionName : beanDefinitionNames) {
//            System.out.println(beanDefinitionName);
//        }
        //Person person = ctx.getBean("person", Person.class);
        //System.out.println(person);
        //System.out.println(ctx.containsBeanDefinition("p"));
        //System.out.println(ctx.containsBean("p"));
        //Person person = ctx.getBean("person", Person.class);
        //System.out.println(person);
//        UserService userService = ctx.getBean("userService", UserService.class);
//        userService.login();
//        Person person = ctx.getBean("person", Person.class);
//        System.out.println(person);

    }
    @Test
    public void test2()
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("/aop/applicationContext2.xml");
        Connection connection = ctx.getBean("connection", Connection.class);
        System.out.println(connection);
//        Customer customer = ctx.getBean("customer", Customer.class);
//        System.out.println(customer);
//        Connection connection = ctx.getBean("conn", Connection.class);
//        System.out.println(connection);
//        Account account1 = ctx.getBean("account", Account.class);
//        Account account2 = ctx.getBean("account", Account.class);
//        System.out.println(account1);
//        System.out.println(account2);
    }
    @Test
    public void test3()
    {
        ClassPathXmlApplicationContext cxt=new ClassPathXmlApplicationContext("/aop/applicationContext3.xml");
        Product product = cxt.getBean("product", Product.class);
        System.out.println(product);
        cxt.close();
    }
    @Test
    public void test4()
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("/aop/applicationContext4.xml");
        OrderService orderService = ctx.getBean("orderService", OrderService.class);
        orderService.register();
        orderService.login();
//        UserService userService=
//                (UserService)ctx.getBean("userService");
//        userService.login();
//        userService.register();
//        UserServiceProxy proxy = ctx.getBean("proxy", UserServiceProxy.class);
//        proxy.login();
//        proxy.register();
//        Account account = ctx.getBean("account", Account.class);
//        System.out.println(account);
//        User user = ctx.getBean("user", User.class);
//        System.out.println(user);

    }
    @Test
    public void test5()
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("/aop/applicationContext6.xml");
        MemberService mermberService = ctx.getBean("memberService", MemberService.class);
        mermberService.login();
        //mermberService.register();
    }
    @Test
    public void test6()
    {
//        ApplicationContext ctx=new ClassPathXmlApplicationContext("/applicationContext.xml");
//        UserDao userDao = ctx.getBean("userDao", UserDao.class);
//        User user=new User();
//        user.setUserName("王子123");
//        user.setPassword("123456");
//        userDao.save(user);
    }
    @Test
    public void test7()
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("/applicationContext.xml");
        UserService userService = ctx.getBean("userService", UserService.class);
        User user=new User();
        user.setUserName("dadsadsadasdsa");
        user.setPassword("123456");
        userService.register(user);
    }
}