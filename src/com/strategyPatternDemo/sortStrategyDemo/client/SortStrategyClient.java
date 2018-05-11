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
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("排序前数据：");
        for (int i = 0; i < array.length; i++) {
            if (i % 10 == 0 && i != 0)
                System.out.println();
            System.out.print(array[i] + " ");
        }
        System.out.println();
        SortContext context = new SortContext();
        SortStrategy strategy = new BubbleSortStrategy();
        context.setStrategy(strategy);
        context.sort(array);
        System.out.println("排序后数据：");
        for (int i = 0; i < array.length; i++) {
            if (i % 10 == 0 && i != 0)
                System.out.println();
            System.out.print(array[i] + " ");
        }
    }
}
