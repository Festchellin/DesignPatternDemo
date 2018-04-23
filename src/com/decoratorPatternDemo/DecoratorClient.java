package com.decoratorPatternDemo;

import com.decoratorPatternDemo.component.Componet;
import com.decoratorPatternDemo.component.decorator.BlackBorderDecorator;
import com.decoratorPatternDemo.component.decorator.ScrollBarDecorator;
import com.decoratorPatternDemo.component.impl.Window;

public class DecoratorClient {
    public static void main(String[] args){
        Componet window = new Window();
        System.out.println("组件原始信息：");
        System.out.println("********************");
        window.display();
        System.out.println("********************");
        ScrollBarDecorator scrollBarDecorator = new ScrollBarDecorator(window);
        System.out.println("组件添加滚动条后信息：");
        System.out.println("********************");
        scrollBarDecorator.display();
        System.out.println("********************");
        BlackBorderDecorator blackBorderDecorator = new BlackBorderDecorator(scrollBarDecorator);
        System.out.println("组件添加滚动条、黑色边框后信息：");
        System.out.println("********************");
        blackBorderDecorator.display();
        System.out.println("********************");
    }
}
