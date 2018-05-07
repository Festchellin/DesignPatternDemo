package com.strategyPatternDemo.sortStrategyDemo.strategy.impl;

import com.strategyPatternDemo.sortStrategyDemo.strategy.SortStrategy;

public class SelectSortStrategy extends SortStrategy {
    @Override
    public int[] sort(int[] array) {
        int t = 0;
        for (int i = 0; i < array.length - 1; i++){
            int index=i;
            for (int j = i + 1; j < array.length; j++)
                if (array[index] > array[j])
                    index=j;
            if(index!=i){ //找到了比array[i]小的则与array[i]交换位置
                t = array[i];
                array[i] = array[index];
                array[index] = t;
            }
        }
        return array;
    }
}
