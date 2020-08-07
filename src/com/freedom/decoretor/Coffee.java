package com.freedom.decoretor;

/**
 * @author baijianliang
 * @date 2019/10/17
 * @description
 */
public abstract class Coffee {

    public String description;

    public String getDescription() {
        return description;
    }

    public void serDescription(String description) {
        this.description = description;
    }

    public abstract double cost();
}
