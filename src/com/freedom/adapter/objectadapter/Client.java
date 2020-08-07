package com.freedom.adapter.objectadapter;

/**
 * @author baijianliang
 * @date 2019/9/29
 * @description
 */
public class Client {

    public static void main(String[] args) {
        Android android = new Adapter(new Iphone());
        android.isAndroid();
    }
}