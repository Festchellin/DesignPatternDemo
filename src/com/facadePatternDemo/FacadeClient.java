package com.facadePatternDemo;

import com.facadePatternDemo.facade.Facade;

public class FacadeClient {
    public static void main(String[] args){
        Facade facade = new Facade();
        facade.operation();
    }

}
