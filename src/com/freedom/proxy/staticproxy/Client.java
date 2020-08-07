package com.freedom.proxy.staticproxy;

/**
 * @author baijianliang
 * @date 2019/11/14
 * @description
 */
public class Client {

    public static void main(String[] args) {
        ProxyFactory proxy = new ProxyFactory(new RealSubject());
        proxy.buy();
    }
}