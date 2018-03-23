package com.FactoryMethodDemo;

public class HaierTVFactory extends TVFactory {
    @Override
    public TV produceTV() {
        return new HaierTV();
    }
}
