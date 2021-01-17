package com.imooc.basic.aop.factoryBean;

import lombok.Data;
import org.springframework.beans.factory.FactoryBean;

import java.sql.Connection;
import java.sql.DriverManager;
@Data
public class ConnectionFactoryBean implements FactoryBean<Connection> {
    private String className;
    private String url;
    private String userName;
    private String password;
    @Override
    public Connection getObject() throws Exception {
        Class.forName(className);
        return DriverManager.getConnection(url,userName,password);
    }

    @Override
    public Class<?> getObjectType() {
        return Connection.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
