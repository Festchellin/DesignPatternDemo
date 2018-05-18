package com.templateMethodPatternDemo.concret;

import com.templateMethodPatternDemo.template.BankTemplateMethod;

import java.util.Scanner;

/**
 * 转账业务
 */
public class Transfer extends BankTemplateMethod {
    @Override
    public void transact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("**************************");
        System.out.println("转账业务开始：");
        System.out.println("请输入转账账户：");
        String account = scanner.next();
        System.out.println("请输入转账金额：");
        Double mount = scanner.nextDouble();
        System.out.println("将转账给账户："+account+",人民币："+mount+"元");
        System.out.println("正在转账.....");
        System.out.println("转账结束！");
        System.out.println("**************************");
        scanner.close();
    }
}
