package com.proxyPatternDemo;

import com.proxyPatternDemo.proxy.PermissionProxy;

public class ProxyPatternClient {
    public static void main(String[] args){
        PermissionProxy permissionProxy = new PermissionProxy();
//        permissionProxy.setLevel(1);
        System.out.println("*****访客访问*****");
        permissionProxy.modifyNote();
        permissionProxy.modifyUserInfo();
        permissionProxy.viewNote();
        permissionProxy.publishNote();
        System.out.println("*****访问结束*****");
    }
}
