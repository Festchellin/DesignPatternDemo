package com.strategyPatternDemo.abstractPattern.strategy.impl;

import com.strategyPatternDemo.abstractPattern.strategy.AbstractStrategy;

public class ConcretStrategyA extends AbstractStrategy {
    @Override
    public void algorithm() {
        System.out.println("Concret Strategy A's algorithm.");
    }
}
