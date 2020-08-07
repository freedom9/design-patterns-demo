package com.freedom.decoretor;

/**
 * @author baijianliang
 * @date 2019/10/17
 * @description
 */
public class Mocha extends Coffee {

    public Mocha() {
        description = "Mocha";
    }

    @Override
    public double cost() {
        return 15.90;
    }
}
