package com.freedom.builder;

/**
 * @author baijianliang
 * @date 2019/9/19
 * @description
 */
public abstract class HouseBuilder {

    public abstract void buildBasis();

    public abstract void buildWall();

    public abstract void buildRoof();

    public abstract House getHouse();
}