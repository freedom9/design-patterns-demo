package com.freedom.bridge;

/**
 * @author baijianliang
 * @date 2019/10/8
 * @description
 */
public class Client {

    public static void main(String[] args) {
        Shape circle = new Circle(new White());
        circle.draw();

        Shape square = new Square(new Black());
        square.draw();
    }
}