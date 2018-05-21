package com.templateMethodPatternDemo.concret;

import com.templateMethodPatternDemo.template.BankTemplateMethod;

import java.util.Scanner;

/**
 * 取钱、提款业务
 */
public class Withdraw extends BankTemplateMethod {
    @Override
    public void transact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("**************************");
        System.out.println("取钱业务开始：");
        System.out.println("请输入取钱数量：（只接受100元人民币）");
        int count = scanner.nextInt();
        System.out.println("将取出人民币："+count*100+"元");
        System.out.println("正在取钱：");
        for (int i = 0; i < 10; i++){
            try {
                Thread.sleep(1000);
                System.out.print("*");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
        System.out.println("取钱结束，再见！");
        System.out.println("**************************");
        scanner.close();
    }
}
