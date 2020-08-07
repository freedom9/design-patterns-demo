package com.freedom.prototype.registrationform;

import java.util.HashMap;
import java.util.Map;

/**
 * @author baijianliang
 * @date 2019/9/18
 * @description
 */
public class PrototypeManager {

    private static Map<String, Prototype> map = new HashMap<>();

    private PrototypeManager(){
    }

    public static void setPrototype(String name, Prototype prototype) {
        map.put(name, prototype);
    }

    public static void removePrototype(String name) {
        map.remove(name);
    }

    public static Prototype getPrototype(String name) throws Exception {
        Prototype prototype = map.get(name);

        if (prototype == null) {
            throw new IllegalArgumentException("no prototype found");
        }
        return prototype;
    }
}