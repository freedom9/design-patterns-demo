package com.freedom.prototype.shallowcloneanddeepclone;

import com.freedom.prototype.shallowcloneanddeepclone.ConcretePrototype;
import com.freedom.prototype.shallowcloneanddeepclone.DeepTarget;

import java.io.IOException;

/**
 * @author baijianliang
 * @date 2019/9/18
 * @description
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.deepTarget = new DeepTarget();
        prototype.deepTarget.setName("freedom");

        // 浅克隆
        ConcretePrototype concretePrototype = (ConcretePrototype) prototype.clone();
        System.out.println("prototype.hashCode=" + prototype.hashCode() + "\t deepTarget.hashCode=" + prototype.deepTarget.hashCode());
        System.out.println("concretePrototype.hashCode=" + concretePrototype.hashCode() + "\t deepTarget.hashCode=" + concretePrototype.deepTarget.hashCode());
        System.out.println("------------------------------------------------------");

        // 深克隆，方式一
        ConcretePrototype concretePrototype1 = (ConcretePrototype) prototype.deepCloneOne();
        System.out.println("prototype.hashCode=" + prototype.hashCode() + "\t deepTarget.hashCode=" + prototype.deepTarget.hashCode());
        System.out.println("concretePrototype1.hashCode=" + concretePrototype1.hashCode() + "\t deepTarget.hashCode=" + concretePrototype1.deepTarget.hashCode());
        System.out.println("------------------------------------------------------");

        // 深克隆，方式二
        ConcretePrototype concretePrototype2 = (ConcretePrototype) prototype.deepCloneTwo();
        System.out.println("prototype.hashCode=" + prototype.hashCode() + "\t deepTarget.hashCode=" + prototype.deepTarget.hashCode());
        System.out.println("concretePrototype2.hashCode=" + concretePrototype2.hashCode() + "\t deepTarget.hashCode=" + concretePrototype2.deepTarget.hashCode());
    }
}