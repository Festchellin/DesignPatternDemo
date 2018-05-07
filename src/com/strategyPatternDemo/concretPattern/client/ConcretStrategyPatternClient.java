package com.strategyPatternDemo.concretPattern.client;

import com.strategyPatternDemo.concretPattern.context.TravelContext;
import com.strategyPatternDemo.concretPattern.strategy.TravelStrategy;
import com.strategyPatternDemo.concretPattern.strategy.impl.TravelByAirPlaneStrategy;

public class ConcretStrategyPatternClient {
    public static void main(String[] args){
        TravelContext context = new TravelContext();
        TravelStrategy strategy = new TravelByAirPlaneStrategy();
        context.setStrategy(strategy);
        context.travel();
    }
}
