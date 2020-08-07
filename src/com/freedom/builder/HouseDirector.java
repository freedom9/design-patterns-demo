package com.freedom.builder;

/**
 * @author baijianliang
 * @date 2019/9/19
 * @description
 */
public class HouseDirector {

    public void buildHouse(HouseBuilder houseBuilder) {
        houseBuilder.buildBasis();
        houseBuilder.buildWall();
        houseBuilder.buildRoof();
    }
}