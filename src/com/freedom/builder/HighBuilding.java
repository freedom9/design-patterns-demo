package com.freedom.builder;

/**
 * @author baijianliang
 * @date 2019/9/19
 * @description
 */
public class HighBuilding extends HouseBuilder{

    private House house = new House();

    @Override
    public void buildBasis() {
        house.setBasis("高楼打地基100m深");
    }

    @Override
    public void buildWall() {
        house.setWall("高楼砌墙30cm宽");
    }

    @Override
    public void buildRoof() {
        house.setRoof("高楼使用透明屋顶");
    }

    @Override
    public House getHouse(){
        return house;
    }
}
