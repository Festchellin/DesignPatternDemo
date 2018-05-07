package com.strategyPatternDemo.sortStrategyDemo.context;

import com.strategyPatternDemo.sortStrategyDemo.strategy.SortStrategy;

public class SortContext {
    private SortStrategy strategy;

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public int[] sort(int[] array){
        return  strategy.sort(array);
    }
}
