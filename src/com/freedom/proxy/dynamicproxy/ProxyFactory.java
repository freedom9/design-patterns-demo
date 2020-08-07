package com.freedom.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author baijianliang
 * @date 2019/11/14
 * @description
 */
public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    // 给目标对象生成一个一个代理对象
    public Object getProxyInstance() {
        /*
        newProxyInstance三个参数说明：
        ClassLoader loader：指定当前目标对象使用类加载器，用null表示默认类加载器。
        Class[] interfaces：需要实现的接口数组。
        InvocationHandler handler：调用处理器，执行目标对象的方法时，会触发调用处理器的方法，从而把当前执行目标对象的方法作为参数传入。
        */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {

                    // 第一个参数是代理类实例，第二个参数是被调用的方法对象，第三个参数是调用参数。
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("代理开始。。。");
                        Object result = method.invoke(target, args);
                        System.out.println("代理结束。。。");
                        return result;
                    }
                });
    }
}