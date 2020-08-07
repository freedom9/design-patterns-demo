package com.freedom.bridge;

/**
 * @author baijianliang
 * @date 2019/10/8
 * @description
 */
public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
