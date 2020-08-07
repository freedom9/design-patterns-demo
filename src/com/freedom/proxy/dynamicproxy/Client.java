package com.freedom.proxy.dynamicproxy;

public class Client {
    
    public static void main(String[] args) {
        
        Subject proxy = (Subject) new ProxyFactory(new RealSubject()).getProxyInstance();
        proxy.buy();
    }
}