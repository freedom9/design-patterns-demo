package com.freedom.bridge;

/**
 * @author baijianliang
 * @date 2019/10/8
 * @description
 */
public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        color.bepaint("圆形");
    }
}