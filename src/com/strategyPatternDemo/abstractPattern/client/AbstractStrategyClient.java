package com.strategyPatternDemo.abstractPattern.client;

import com.strategyPatternDemo.abstractPattern.context.Context;
import com.strategyPatternDemo.abstractPattern.strategy.AbstractStrategy;
import com.strategyPatternDemo.abstractPattern.strategy.impl.ConcretStrategyB;

public class AbstractStrategyClient {
    public static void main(String[] args){
        Context context = new Context();
        AbstractStrategy strategy = new ConcretStrategyB();
        context.setStrategy(strategy);
        context.algorithm();
    }
}
