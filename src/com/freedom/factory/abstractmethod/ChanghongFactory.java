package com.freedom.factory.abstractmethod;

/**
 * @author baijianliang
 * @date 2019/9/18
 * @description
 */
public class ChanghongFactory extends Factory {

    public TV watchTV() {
        return new ChanghongTV();
    }
    
    public Refrigerator takeThings() {
        return new ChanghongRefrigerator();
    }
}