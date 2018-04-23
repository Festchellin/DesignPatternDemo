package com.decoratorPatternDemo.component.decorator;

import com.decoratorPatternDemo.component.Componet;

public class BlackBorderDecorator extends BaseDecorator {
    /**
     * 构造方法
     *
     * @param componet 待添加自定义样式的组件
     */
    public BlackBorderDecorator(Componet componet) {
        super(componet);
    }

    public void setBlackBorder(){
        System.out.println("已为组件添加黑色边框");
    }
    @Override
    public void display() {
        super.display();
        setBlackBorder();
    }
}
