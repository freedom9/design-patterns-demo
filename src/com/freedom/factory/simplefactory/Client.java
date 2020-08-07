package com.freedom.factory.simplefactory;

/**
 * @author baijianliang
 * @date 2020/7/28 14:01
 */
public class Client {

    public static void main(String[] args) throws Exception {
        TV tv = Factory.watchTV("Haier");
        tv.openTV();
    }
}
