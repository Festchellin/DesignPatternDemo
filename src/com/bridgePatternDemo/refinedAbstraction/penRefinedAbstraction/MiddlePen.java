package com.bridgePatternDemo.refinedAbstraction.penRefinedAbstraction;

import com.bridgePatternDemo.abstraction.Pen;

public class MiddlePen extends Pen {
    private String penType = "中号";

    @Override
    public void draw(String name) {
        color.bePainte(penType, name);
    }
}
