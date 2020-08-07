package com.freedom.singleton;

/**
 * @author baijianliang
 * @date 2019/9/18
 * @description
 */
public class Singleton1 {

    // 1、构造器私有化，防止new
    private Singleton1(){
    }

    // 2、类内部创建对象实例
    private static final Singleton1 INSTANCE = new Singleton1();

    // 3、提供一个公有的静态方法，返回实例对象
    public static Singleton1 getInstance() {
        return INSTANCE;
    }
}