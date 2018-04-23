package com.decoratorPatternDemo.component.impl;

import com.decoratorPatternDemo.component.Componet;

public class ListBox extends Componet {
    @Override
    public void display() {
        System.out.println("基本列表组件");
    }
}
