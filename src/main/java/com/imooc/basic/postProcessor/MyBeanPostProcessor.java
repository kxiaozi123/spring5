package com.imooc.basic.postProcessor;

import com.imooc.basic.model.Account;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor  implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        //System.out.println("MyBeanPostProcessor.postProcessBeforeInitialization");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        //System.out.println("MyBeanPostProcessor.postProcessAfterInitialization");
       if(bean instanceof Account)
       {
           Account account= (Account) bean;
           account.setBalance("101");
       }
        return bean;
    }
}
