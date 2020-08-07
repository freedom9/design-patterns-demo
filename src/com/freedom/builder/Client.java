package com.freedom.builder;

/**
 * @author baijianliang
 * @date 2019/9/19
 * @description
 */
public class Client {

    public static void main(String[] args) {
        HouseBuilder highBuilding = new HighBuilding();
        HouseDirector houseDirector = new HouseDirector();
        houseDirector.buildHouse(highBuilding);
        System.out.println(highBuilding.getHouse().toString());
    }
}