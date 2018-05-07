package com.strategyPatternDemo.concretPattern.context;

import com.strategyPatternDemo.concretPattern.strategy.TravelStrategy;

public class TravelContext {
    private TravelStrategy strategy;
    public void  travel(){
        strategy.travel();
    }

    public void setStrategy(TravelStrategy strategy) {
        this.strategy = strategy;
    }
}
