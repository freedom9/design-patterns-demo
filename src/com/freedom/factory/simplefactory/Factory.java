package com.freedom.factory.simplefactory;

/**
 * @author baijianliang
 * @date 2019/9/18
 * @description
 */
public class Factory {

    public static TV watchTV(String type) throws Exception {
        if (type.equals("Haier")) {
            return new HaierTV();
        } else if (type.equals("Changhong")) {
            return new ChanghongTV();
        } else {
            throw new IllegalArgumentException("no correspond TV");
        }
    }
}