package com.freedom.decoretor;

/**
 * @author baijianliang
 * @date 2019/10/17
 * @description
 */
public class Espresso extends Coffee {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 12.50;
    }
}
