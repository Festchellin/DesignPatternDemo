package com.simpleFactoryDemo;

public class UserClient {
    public static void main(String[] args){
        User user;
        try {
            user = SimpleUserFactory.createUserInstance(2);
            user.diffOperation();
        }catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
