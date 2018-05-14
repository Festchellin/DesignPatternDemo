package com.proxyPatternDemo.subject.impl;

import com.proxyPatternDemo.subject.AbstractPermission;

public class RealPermission implements AbstractPermission {
    @Override
    public void modifyUserInfo() {
            System.out.println("该用户可修改个人信息！");
    }

    @Override
    public void viewNote() {
        System.out.println("查看帖子");
    }

    @Override
    public void publishNote() {
        System.out.println("该用户可发布帖子！");

    }

    @Override
    public void modifyNote() {
            System.out.println("该用户可修改帖子！");
    }

    @Override
    public void setLevel(int level) {
    }
}
