package com.freedom.factory.factorymethod;

/**
 * @author baijianliang
 * @date 2019/9/18
 * @description
 */
public class ChanghongFactory extends Factory {

    public TV watchTV() {
        return new ChanghongTV();
    }
}