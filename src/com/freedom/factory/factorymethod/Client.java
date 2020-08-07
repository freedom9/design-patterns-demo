package com.freedom.factory.factorymethod;


/**
 * @author baijianliang
 * @date 2019/9/18
 * @description
 */
public class Client {

    public static void main(String[] args) throws Exception {
        Factory factory = new HaierFactory();
        TV tv = factory.watchTV();
        tv.openTV();
    }
}