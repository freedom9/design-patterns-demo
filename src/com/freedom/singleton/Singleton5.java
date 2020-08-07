package com.freedom.singleton;

/**
 * @author baijianliang
 * @date 2019/9/18
 * @description
 */
public class Singleton5 {

    private Singleton5() {
    }

    private static class SingletonInstance {
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    public static Singleton5 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}