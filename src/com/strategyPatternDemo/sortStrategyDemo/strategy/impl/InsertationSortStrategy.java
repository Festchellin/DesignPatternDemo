package com.strategyPatternDemo.sortStrategyDemo.strategy.impl;

import com.strategyPatternDemo.sortStrategyDemo.strategy.SortStrategy;

public class InsertationSortStrategy extends SortStrategy {
    @Override
    public int[] sort(int[] array) {
        int i, j, t = 0;
        for (i = 1; i < array.length; i++) {
            t = array[i];
            for (j = i - 1; j >= 0 && t < array[j]; j--)
                array[j + 1] = array[j];
            array[j + 1] = t;
        }
        return array;
    }
}
