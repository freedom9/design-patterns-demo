package com.freedom.flyweight.compoundflyweight;

import java.util.HashMap;
import java.util.List;
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

    // 单纯享元模式
    public WebSite getFlyWeight(String type) {
        WebSite webSite = webSites.get(type);
        if (webSite == null) {
            webSite = new ConcreteWebSite(type);
            webSites.put(type, webSite);
        }
        return webSite;
    }

    // 复合享元模式
    public WebSite getFlyWeight(List<String> types) {
        CompositeConcreteWebSite webSite = new CompositeConcreteWebSite();
        for (String type : types) {
            webSite.add(type, this.getFlyWeight(type));
        }
        return webSite;
    }

    public int getWebSiteCount() {
        return webSites.size();
    }
}
