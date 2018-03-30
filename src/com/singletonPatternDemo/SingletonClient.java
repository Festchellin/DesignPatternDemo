package com.singletonPatternDemo;

import com.singletonPatternDemo.bean.Singleton;

public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println("Singleton1:" + singleton1);
        System.out.println("Singleton2:" + singleton2);
    }
}
