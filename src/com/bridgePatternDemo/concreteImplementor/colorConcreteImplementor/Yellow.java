package com.bridgePatternDemo.concreteImplementor.colorConcreteImplementor;

import com.bridgePatternDemo.implementor.Color;

public class Yellow implements Color {
    @Override
    public void bePainte(String penType, String name) {
        System.out.println("使用" + penType + "画笔，画了一个黄色的" + name);
    }
}
