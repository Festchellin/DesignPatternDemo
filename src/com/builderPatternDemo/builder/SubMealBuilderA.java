package com.builderPatternDemo.builder;

public class SubMealBuilderA extends Builder {
    @Override
    public void buildFood() {
        getMeal().setFood("Hamburger");
    }

    @Override
    public void buildDrink() {
        getMeal().setDrink("Coca-Cola");
    }
}
