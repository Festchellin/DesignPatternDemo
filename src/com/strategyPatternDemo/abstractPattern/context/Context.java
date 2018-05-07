package com.strategyPatternDemo.abstractPattern.context;

import com.strategyPatternDemo.abstractPattern.strategy.AbstractStrategy;

public class Context {
    private AbstractStrategy strategy;
    public void algorithm(){
        strategy.algorithm();
    }

    public void setStrategy(AbstractStrategy strategy) {
        this.strategy = strategy;
    }
}
