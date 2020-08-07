package com.freedom.flyweight.compoundflyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * @author baijianliang
 * @date 2019/11/12
 * @description
 */
public class Client {

    public static void main(String[] args) {

        WebSiteFactory factory = WebSiteFactory.getInstance();

        List<String> types = new ArrayList<>();
        types.add("新闻");
        types.add("博客");
        types.add("视频");

        WebSite webSite1 = factory.getFlyWeight(types);
        webSite1.use("小白");

        WebSite webSite2 = factory.getFlyWeight(types);
        webSite2.use("小明");

        // 不相等，复合享元对象不可共享
        System.out.println(webSite1 == webSite2);
    }
}
