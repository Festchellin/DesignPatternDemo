package com.prototypePatternDemo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class PrototypeClient {
    public static void main(String[] args){
//        SimpleDateFormat formater =new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);
        WeeklyLog log_previous = new WeeklyLog();  //创建原型对象
        log_previous.setName("张无忌");
        log_previous.setDate("第12周");
        log_previous.setContent("这周工作很忙，每天加班！");
        log_previous.show();
        WeeklyLog  log_new;
        log_new  = log_previous.clone(); //调用克隆方法创建克隆对象

        System.out.println(log_previous == log_new);
        System.out.println(log_previous.getDate() == log_new.getDate());
        System.out.println(log_previous.getName() == log_new.getName());
        System.out.println(log_previous.getContent() == log_new.getContent());

        log_new.setDate("第13周");
        log_new.show();

        System.out.println(log_previous == log_new);
        System.out.println(log_previous.getDate() == log_new.getDate());
        System.out.println(log_previous.getName() == log_new.getName());
        System.out.println(log_previous.getContent() == log_new.getContent());
    }
}
