package com.bridgePatternDemo.abstraction;

import com.bridgePatternDemo.implementor.Color;

public abstract class Pen {
    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    ;

    public abstract void draw(String name);
}
