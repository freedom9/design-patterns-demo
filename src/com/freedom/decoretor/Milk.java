package com.freedom.decoretor;

/**
 * @author baijianliang
 * @date 2019/10/17
 * @description
 */
public class Milk extends CondimentDecorator {

    private Coffee coffee;

    public Milk(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Mike";
    }

    @Override
    public double cost() {
        return coffee.cost() + 2.0;
    }
}