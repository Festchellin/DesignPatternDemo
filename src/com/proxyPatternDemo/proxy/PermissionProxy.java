package com.proxyPatternDemo.proxy;

import com.proxyPatternDemo.subject.AbstractPermission;
import com.proxyPatternDemo.subject.impl.RealPermission;

public class PermissionProxy implements AbstractPermission {
    private RealPermission permission = new RealPermission();
    private int leve1 = 0;

    @Override
    public void modifyUserInfo() {
        if (leve1 > 0)
            permission.modifyUserInfo();
        else
            System.out.println("无法修改用户信息");
    }

    @Override
    public void viewNote() {
        permission.viewNote();
    }

    @Override
    public void publishNote() {
        if (leve1 > 0)
            permission.publishNote();
        else
            System.out.println("无法发布帖子");
    }

    @Override
    public void modifyNote() {
        if (leve1 > 0)
            permission.modifyNote();
        else
            System.out.println("无法修改帖子内容");
    }

    @Override
    public void setLevel(int level) {
        this.leve1 = level;
    }
}
