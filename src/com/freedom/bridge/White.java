package com.freedom.bridge;

/**
 * @author baijianliang
 * @date 2019/10/8
 * @description
 */
public class White implements Color {

    @Override
    public void bepaint(String shape) {
        System.out.println("白色的" + shape);
    }
}