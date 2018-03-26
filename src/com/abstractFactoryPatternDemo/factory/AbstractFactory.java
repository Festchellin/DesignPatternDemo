package com.abstractFactoryPatternDemo.factory;

import com.abstractFactoryPatternDemo.product.AirConfditioner;
import com.abstractFactoryPatternDemo.product.Television;

public abstract class AbstractFactory {
    public abstract Television produceTelevision();

    public abstract AirConfditioner produceAirConditioner();
}
