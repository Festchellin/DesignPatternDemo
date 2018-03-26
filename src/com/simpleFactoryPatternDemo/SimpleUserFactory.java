package com.simpleFactoryPatternDemo;

public class SimpleUserFactory {
    /**
     * 按照用户权限创建用户
     *
     * @param permission (0：Employee,1：Manager,2：Administrator)   用户权限
     * @return User or null，如果permission不再0-2之间返回null,其他的则返回相应的User实例
     */
    public static User createUserInstance(int permission) {
        if (permission == 0) {
            return new Employee();
        } else if (permission == 1) {
            return new Manager();
        } else if (permission == 2) {
            return new Administrator();
        } else {
            System.out.println("没有此项权限的用户供给创建!");
            throw new IllegalArgumentException();
        }
    }
}
