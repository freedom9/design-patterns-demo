package com.freedom.template;

/**
 * @author baijianliang
 * @date 2019/11/15
 * @description
 */
public class Client {

    public static void main(String[] args) {

        System.out.println("------制作杏仁豆浆------");
        SoyMilk almondSoyMilk = new AlmondSoyMilk();
        almondSoyMilk.make();

        System.out.println("------制作核桃豆浆------");
        SoyMilk walnutSoyMilk = new WalnutSoyMilk();
        walnutSoyMilk.make();

        System.out.println("------制作原味豆浆------");
        SoyMilk originalSoyMilk = new OriginalSoyMilk();
        originalSoyMilk.make();
    }
}