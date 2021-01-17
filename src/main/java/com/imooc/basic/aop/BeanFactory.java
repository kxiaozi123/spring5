package com.imooc.basic.aop;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BeanFactory {
    private static final Properties env=new Properties();
    static {
        InputStream stream = BeanFactory.class.getResourceAsStream("/aop/application.properties");
        try {
            env.load(stream);
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static Object getBean(String key){
        Object ret=null;
        try {
            Class<?> clazz = Class.forName(env.getProperty(key));
            ret=clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
    }
}
