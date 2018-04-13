package com.bridgePatternDemo.refinedAbstraction.penRefinedAbstraction;

import com.bridgePatternDemo.abstraction.Pen;

public class SmallPen extends Pen {
    private String penType = "小号";

    @Override
    public void draw(String name) {
        color.bePainte(penType, name);
    }
}
