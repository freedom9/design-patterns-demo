package com.freedom.decoretor;

/**
 * @author baijianliang
 * @date 2019/10/17
 * @description
 */
public class Client {

    public static void main(String arg[]) {

        Coffee mocha = new Mocha();
        mocha = new Sugar(mocha);
        mocha = new Sugar(mocha);
        System.out.println(mocha.getDescription() + "  $" + mocha.cost());

        Coffee espresso = new Espresso();
        espresso = new Milk(espresso);
        espresso = new Sugar(espresso);
        System.out.println(espresso.getDescription() + "  $" + espresso.cost());
    }
}