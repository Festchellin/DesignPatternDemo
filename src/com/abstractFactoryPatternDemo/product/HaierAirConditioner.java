package com.abstractFactoryPatternDemo.product;

public class HaierAirConditioner extends AirConfditioner {
    @Override
    public void changeTemperature() {
        System.out.println("Haier Aircondion is changing the temperature now.");
    }
}
