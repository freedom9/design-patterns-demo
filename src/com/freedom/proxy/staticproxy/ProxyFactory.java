package com.freedom.proxy.staticproxy;

/**
 * @author baijianliang
 * @date 2019/11/14
 * @description
 */
public class ProxyFactory implements Subject {

    private Subject target;

    public ProxyFactory(Subject target) {
        this.target = target;
    }

    @Override
    public void buy(){
        System.out.println("代理开始。。。");
        target.buy();
        System.out.println("代理结束。。。");
    }
}