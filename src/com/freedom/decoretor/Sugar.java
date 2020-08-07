package com.freedom.decoretor;

/**
 * @author baijianliang
 * @date 2019/10/17
 * @description
 */
public class Sugar extends CondimentDecorator {

    private Coffee coffee;

    public Sugar(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }

    @Override
    public double cost() {
        return coffee.cost() + 1.0;
    }
}