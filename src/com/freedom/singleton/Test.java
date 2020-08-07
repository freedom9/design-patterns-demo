package com.freedom.singleton;

/**
 * @author baijianliang
 * @date 2019/9/18
 * @description
 */
public class Test {

    public static void main(String[] args) {
        Singleton6 singleton1 = Singleton6.INSTANCE;
        Singleton6 singleton2 = Singleton6.INSTANCE;

        System.out.println(singleton1 == singleton2);
    }
}
