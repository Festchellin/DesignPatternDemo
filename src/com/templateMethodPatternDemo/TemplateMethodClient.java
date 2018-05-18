package com.templateMethodPatternDemo;

import com.templateMethodPatternDemo.concret.Transfer;
import com.templateMethodPatternDemo.template.BankTemplateMethod;

public class TemplateMethodClient {
    public static void main(String[] args){
        BankTemplateMethod operation = new Transfer();
        operation.process();
    }
}
