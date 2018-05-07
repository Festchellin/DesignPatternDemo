package com.strategyPatternDemo.concretPattern.strategy.impl;

import com.strategyPatternDemo.concretPattern.strategy.TravelStrategy;

public class TravelByTrainStrategy extends TravelStrategy {
    @Override
    public void travel() {
        System.out.println("Travel by Train.");
    }
}
