package com.builderPatternDemo.builder;

import com.builderPatternDemo.product.Meal;

public abstract class Builder {
    private Meal meal = new Meal();

    public abstract void buildFood();

    public abstract void buildDrink();

    public Meal getMeal() {
        return meal;
    }
}
