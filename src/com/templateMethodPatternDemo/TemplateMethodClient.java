package com.templateMethodPatternDemo;

import com.templateMethodPatternDemo.concret.Deposit;
import com.templateMethodPatternDemo.concret.Transfer;
import com.templateMethodPatternDemo.concret.Withdraw;
import com.templateMethodPatternDemo.template.BankTemplateMethod;

public class TemplateMethodClient {
    public static void main(String[] args){
        BankTemplateMethod operation = new Deposit();
        operation.process();
    }
}
