package com.freedom.facade;

/**
 * @author baijianliang
 * @date 2019/11/7
 * @description
 */
public class Facade {

    private Light light;

    private TV tv;

    private AirCondition airCondition;

    public Facade() {
        this.light = new Light();
        this.tv = new TV();
        this.airCondition = new AirCondition();
    }

    public void open() {
        light.on();
        tv.on();
        airCondition.on();
    }

    public void close() {
        tv.off();
        light.off();
    }
}