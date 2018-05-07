package com.strategyPatternDemo.sortStrategyDemo.strategy.impl;

import com.strategyPatternDemo.sortStrategyDemo.strategy.SortStrategy;

public class BubbleSortStrategy extends SortStrategy {
    @Override
    public int[] sort(int[] array) {
        int t = 0;
        for (int i = 0; i < array.length - 1; i++)
            for (int j = 0; j < array.length - 1 - i; j++)
                if (array[j] > array[j + 1]) {
                    t = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = t;
                }
        return array;
    }
}
