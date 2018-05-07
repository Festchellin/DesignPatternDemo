package com.strategyPatternDemo.concretPattern.strategy.impl;

import com.strategyPatternDemo.concretPattern.strategy.TravelStrategy;

public class TravelByCarStrategy extends TravelStrategy {
    @Override
    public void travel() {
        System.out.println("Travel by Car.");
    }
}
