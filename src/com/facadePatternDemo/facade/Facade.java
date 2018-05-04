package com.facadePatternDemo.facade;

import com.facadePatternDemo.subsystem.SubsystemA;
import com.facadePatternDemo.subsystem.SubsystemB;
import com.facadePatternDemo.subsystem.SubsystemC;

/**
 * 外观模式的外观角色
 * 负责将子系统组合起来
 */
public class Facade {
    private SubsystemA subsystemA;
    private SubsystemB subsystemB;
    private SubsystemC subsystemC;

    public Facade() {
        subsystemA = new SubsystemA();
        subsystemB = new SubsystemB();
        subsystemC = new SubsystemC();
    }
    public void  operation(){
        System.out.println("Facade's operation begin");
        subsystemA.operation();
        subsystemB.operation();
        subsystemC.operation();
        System.out.println("Facade's operation finished");
    }
}
