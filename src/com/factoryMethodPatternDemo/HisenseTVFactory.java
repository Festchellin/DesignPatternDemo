package com.factoryMethodPatternDemo;

public class HisenseTVFactory extends TVFactory {
    @Override
    public TV produceTV() {
        return new HisenseTV();
    }
}
