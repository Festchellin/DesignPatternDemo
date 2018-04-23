package com.decoratorPatternDemo.component.decorator;

import com.decoratorPatternDemo.component.Componet;

public class BaseDecorator extends Componet {
    public Componet componet;

    /**
     * 构造方法
     * @param componet 待添加自定义样式的组件
     */
    public BaseDecorator(Componet componet) {
        this.componet = componet;
    }

    @Override
    public void display() {
        componet.display();
    }
}
