package com.freedom.facade;

/**
 * @author baijianliang
 * @date 2019/11/7
 * @description
 */
public class Client {

    public static void main(String[] args) {
        AirCondition airCodition = new AirCondition();
        Facade facade = new Facade();

        System.out.println("----------下班回到家----------");
        facade.open();

        System.out.println("----------上床睡觉----------");
        facade.close();

        System.out.println("----------早上起床----------");
        airCodition.off();
    }
}
