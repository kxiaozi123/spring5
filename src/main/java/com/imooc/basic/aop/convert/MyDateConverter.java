package com.imooc.basic.aop.convert;

import lombok.Data;
import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
@Data
public class MyDateConverter  implements Converter<String, Date> {
    private String pattern;
    @Override
    public Date convert(String s) {
        Date date=null;
        SimpleDateFormat sdf=new SimpleDateFormat(pattern);
        try {
            date = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
