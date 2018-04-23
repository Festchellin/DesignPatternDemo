package com.decoratorPatternDemo.component.decorator;

import com.decoratorPatternDemo.component.Componet;

/**
 * 给组件添加滚动条
 */
public class ScrollBarDecorator extends BaseDecorator {

    /**
     * 构造方法
     *
     * @param componet 待添加自定义样式的组件
     */
    public ScrollBarDecorator(Componet componet) {
        super(componet);
    }

    public void setScrollBar(){
        System.out.println("已为该组件添加滚动条");
    }
    @Override
    public void display() {
        super.display();
        setScrollBar();
    }
}
