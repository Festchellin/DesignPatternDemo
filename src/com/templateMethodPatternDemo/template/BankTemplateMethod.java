package com.templateMethodPatternDemo.template;

/**
 * 银行业务办理流程模板实现类
 */
public abstract class BankTemplateMethod {
    /**
     * 取票流程实现方法
     */
    public void takeNumber(){
        System.out.println("**************************");
        System.out.println("排队取号中");
        System.out.println("取号完毕，请去柜台办理业务");
        System.out.println("**************************");
    }

    /**
     * 具体业务抽象方法
     */
    public abstract void transact();

    /**
     * 评价办理业务实现方法
     */
    public void evaluate(){
        System.out.println("**************************");
        System.out.println("业务办理完毕，请评价是否满意");
        System.out.println("默认五星好评，谢谢你的使用，再见！");
        System.out.println("**************************");
    }

    /**
     * 处理逻辑组合
     */
    public  void process(){
        takeNumber();
        transact();
        evaluate();
    }
}
