package com.strategyPatternDemo.abstractPattern.strategy.impl;

import com.strategyPatternDemo.abstractPattern.strategy.AbstractStrategy;

public class ConcretStrategyB extends AbstractStrategy {
    @Override
    public void algorithm() {
        System.out.println("Concret StrategyB's algorithm.");
    }
}
