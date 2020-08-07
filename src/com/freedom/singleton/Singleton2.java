package com.freedom.singleton;

/**
 * @author baijianliang
 * @date 2019/9/18
 * @description
 */
public class Singleton2 {

    private Singleton2() {
    }

    private static Singleton2 instance;

    public static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}