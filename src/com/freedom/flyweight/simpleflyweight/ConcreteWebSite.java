package com.freedom.flyweight.simpleflyweight;

/**
 * @author baijianliang
 * @date 2019/11/12
 * @description
 */
public class ConcreteWebSite implements WebSite {

    // 内部状态
    private String type;

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(String name) {
        System.out.println(name + "在使用以《" + type + "》形式发布的网站");
    }
}