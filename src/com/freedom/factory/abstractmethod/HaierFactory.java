package com.freedom.factory.abstractmethod;


public class HaierFactory extends Factory {

    public TV watchTV() {
        return new HaierTV();
    }

    public Refrigerator takeThings() {
        return new HaierRefrigerator();
    }
}