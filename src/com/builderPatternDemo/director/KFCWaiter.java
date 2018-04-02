package com.builderPatternDemo.director;

import com.builderPatternDemo.builder.Builder;
import com.builderPatternDemo.product.Meal;

public class KFCWaiter {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public KFCWaiter(Builder builder) {
        this.builder = builder;
    }

    public Meal construct() {
        builder.buildFood();
        builder.buildDrink();
        Meal meal = builder.getMeal();
        System.out.println(meal.toString());
        return meal;
    }
}
