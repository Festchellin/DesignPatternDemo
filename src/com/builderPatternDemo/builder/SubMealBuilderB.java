package com.builderPatternDemo.builder;

public class SubMealBuilderB extends Builder {
    @Override
    public void buildFood() {
        getMeal().setFood("Bread");
    }

    @Override
    public void buildDrink() {
        getMeal().setDrink("Fender");
    }
}
