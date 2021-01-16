package com.imooc.basic.model;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
@Data
public class Person {
    private String id;
    private String name;
    private String[] emails;
    private Set<String> tels;
    private List<String> address;
    private Map<String,String> qqs;
    private Properties properties;


}
