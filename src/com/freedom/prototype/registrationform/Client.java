package com.freedom.prototype.registrationform;

/**
 * @author baijianliang
 * @date 2019/9/18
 * @description
 */
public class Client {

    public static void main(String[] args) {
        try {
            Prototype prototype = new ConcretePrototype();
            PrototypeManager.setPrototype("com.freedom.ConcretePrototype", prototype);

            ConcretePrototype concretePrototype = (ConcretePrototype)PrototypeManager.getPrototype("com.freedom.ConcretePrototype").clone();

            System.out.println("prototype.hashcode=" + prototype.hashCode());
            System.out.println("concretePrototype.hashcode=" + concretePrototype.hashCode());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}