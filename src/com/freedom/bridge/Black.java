package com.freedom.bridge;

/**
 * @author baijianliang
 * @date 2019/10/8
 * @description
 */
public class Black implements Color {

    @Override
    public void bepaint(String shape) {
        System.out.println("黑色的" + shape);
    }
}
