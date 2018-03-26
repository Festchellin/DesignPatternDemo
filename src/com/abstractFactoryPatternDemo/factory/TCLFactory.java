package com.abstractFactoryPatternDemo.factory;

import com.abstractFactoryPatternDemo.product.AirConfditioner;
import com.abstractFactoryPatternDemo.product.TCLAirConditioner;
import com.abstractFactoryPatternDemo.product.TCLTelevision;
import com.abstractFactoryPatternDemo.product.Television;

public class TCLFactory extends AbstractFactory {
    @Override
    public Television produceTelevision() {
        return new TCLTelevision();
    }

    @Override
    public AirConfditioner produceAirConditioner() {
        return new TCLAirConditioner();
    }
}
