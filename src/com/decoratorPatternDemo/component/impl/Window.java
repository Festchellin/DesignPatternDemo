package com.decoratorPatternDemo.component.impl;

import com.decoratorPatternDemo.component.Componet;

public class Window extends Componet {
    @Override
    public void display() {
      System.out.println("基本窗体组件");
    }
}
