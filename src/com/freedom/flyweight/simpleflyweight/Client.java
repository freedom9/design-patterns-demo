package com.freedom.flyweight.simpleflyweight;

/**
 * @author baijianliang
 * @date 2019/11/12
 * @description
 */
public class Client {

    public static void main(String[] args) {
        
        WebSiteFactory factory = WebSiteFactory.getInstance();
        
        WebSite news = factory.getFlyWeight("新闻");
        news.use("小白");
        
        WebSite blog1 = factory.getFlyWeight("博客");
        blog1.use("小明");
        
        WebSite blog2 = factory.getFlyWeight("博客");
        blog2.use("小红");
        
        System.out.println("网站的分类总数=" + factory.getWebSiteCount());
    }
}