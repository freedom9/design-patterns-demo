package com.freedom.visitor;

/**
 * @author baijianliang
 * @date 2019/11/22
 * @description
 */
public class Client {

    public static void main(String[] args) {

        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.add(new Man());
        objectStructure.add(new Woman());

        Success success = new Success();
        objectStructure.display(success);
        System.out.println("---------------------------");

        Fail fail = new Fail();
        objectStructure.display(fail);
    }
}
