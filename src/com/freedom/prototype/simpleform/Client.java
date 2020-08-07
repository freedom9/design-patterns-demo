package com.freedom.prototype.simpleform;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype = new ConcretePrototype();
        ConcretePrototype concretePrototype = (ConcretePrototype)prototype.clone();
       
        System.out.println("prototype.hashCode=" + prototype.hashCode());
        System.out.println("concretePrototype.hashCode=" + concretePrototype.hashCode());        
    }
}