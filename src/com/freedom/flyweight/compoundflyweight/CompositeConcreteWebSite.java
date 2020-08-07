package com.freedom.flyweight.compoundflyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author baijianliang
 * @date 2019/11/12
 * @description
 */
public class CompositeConcreteWebSite implements WebSite {

    private Map<String, WebSite> webSites = new HashMap<>();

    @Override
    public void use(String name) {
        for (Map.Entry<String, WebSite> entry : webSites.entrySet()) {
            entry.getValue().use(name);
        }
    }

    public void add(String type, WebSite webSite) {
        webSites.put(type, webSite);
    }

    public void remove(String type) {
        webSites.remove(type);
    }
}
