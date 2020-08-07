package com.freedom.proxy.cglibproxy;

/**
 * @author baijianliang
 * @date 2019/11/14
 * @description
 */
public class Client {

    public static void main(String[] args) {
        RealSubject proxy = (RealSubject) new ProxyFactory(new RealSubject()).getProxyInstance();
        proxy.buy();
    }
}
