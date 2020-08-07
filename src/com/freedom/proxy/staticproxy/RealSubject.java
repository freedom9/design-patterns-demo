package com.freedom.proxy.staticproxy;

/**
 * @author baijianliang
 * @date 2019/11/14
 * @description
 */
public class RealSubject implements Subject {
    
    @Override
    public void buy() {
        System.out.println("购买一台港版的MacBook Pro");
    }
}