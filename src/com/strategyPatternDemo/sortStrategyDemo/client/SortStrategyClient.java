package com.strategyPatternDemo.sortStrategyDemo.client;

import com.strategyPatternDemo.sortStrategyDemo.context.SortContext;
import com.strategyPatternDemo.sortStrategyDemo.strategy.SortStrategy;
import com.strategyPatternDemo.sortStrategyDemo.strategy.impl.BubbleSortStrategy;
import com.strategyPatternDemo.sortStrategyDemo.strategy.impl.InsertationSortStrategy;
import com.strategyPatternDemo.sortStrategyDemo.strategy.impl.QuickSortStrategy;
import com.strategyPatternDemo.sortStrategyDemo.strategy.impl.SelectSortStrategy;

import java.util.ArrayList;
import java.util.Random;

public class SortStrategyClient {
    public static void main(String[] args){
        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0; i < 100; i++){
            array[i] = random.nextInt(100);
        }
        SortContext context = new SortContext();
        SortStrategy strategy = new QuickSortStrategy();
        context.setStrategy(strategy);
        context.sort(array);
        for (int num : array){
            System.out.print(num +" ");
        }
    }
}
