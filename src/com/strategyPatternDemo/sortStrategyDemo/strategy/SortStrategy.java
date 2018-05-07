package com.strategyPatternDemo.sortStrategyDemo.strategy;

public abstract class SortStrategy {
    private int[] array;

    public void setArray(int[] array) {
        this.array = array;
    }
    public abstract int[] sort(int[] array);
}
