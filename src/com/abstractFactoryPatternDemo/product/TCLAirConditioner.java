package com.abstractFactoryPatternDemo.product;

public class TCLAirConditioner extends AirConfditioner {
    @Override
    public void changeTemperature() {
        System.out.println("TCL AirCondotion is changing the temperature now.");
    }
}
