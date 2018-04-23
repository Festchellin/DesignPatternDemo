package com.decoratorPatternDemo.component.impl;

import com.decoratorPatternDemo.component.Componet;

public class TextBox extends Componet {
    @Override
    public void display() {
        System.out.println("基本文本框组件");
    }
}
