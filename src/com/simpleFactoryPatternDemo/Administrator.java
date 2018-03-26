package com.simpleFactoryPatternDemo;

public class Administrator extends User {
    @Override
    public void diffOperation() {
        System.out.println("管理员操作！");
    }
}
