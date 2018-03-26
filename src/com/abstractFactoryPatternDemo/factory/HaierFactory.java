package com.abstractFactoryPatternDemo.factory;

import com.abstractFactoryPatternDemo.product.AirConfditioner;
import com.abstractFactoryPatternDemo.product.HaierAirConditioner;
import com.abstractFactoryPatternDemo.product.HaierTelevision;
import com.abstractFactoryPatternDemo.product.Television;

public class HaierFactory extends AbstractFactory {
    @Override
    public Television produceTelevision() {
        return new HaierTelevision();
    }

    @Override
    public AirConfditioner produceAirConditioner() {
        return new HaierAirConditioner();
    }
}
