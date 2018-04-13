package com.bridgePatternDemo.refinedAbstraction.penRefinedAbstraction;

import com.bridgePatternDemo.abstraction.Pen;

public class LargePen extends Pen {
    private String penType = "大号";

    @Override
    public void draw(String name) {
        color.bePainte(penType, name);
    }
}
