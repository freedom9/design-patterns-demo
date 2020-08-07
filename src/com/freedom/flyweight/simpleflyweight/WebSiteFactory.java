package com.freedom.flyweight.simpleflyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author baijianliang
 * @date 2019/11/12
 * @description
 */
public class WebSiteFactory {

    private static WebSiteFactory FACTORY = new WebSiteFactory();

    private WebSiteFactory(){}

    public static WebSiteFactory getInstance() {
        return FACTORY;
    }

    private Map<String, WebSite> webSites = new HashMap<>();

    public WebSite getFlyWeight(String type) {
        WebSite webSite = webSites.get(type);
        if (webSite == null) {
            webSite = new ConcreteWebSite(type);
            webSites.put(type, webSite);
        }
        return webSite;
    }

    public int getWebSiteCount() {
        return webSites.size();
    }
}