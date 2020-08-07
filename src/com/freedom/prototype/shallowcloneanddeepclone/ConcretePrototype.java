package com.freedom.prototype.shallowcloneanddeepclone;

import com.freedom.prototype.simpleform.Prototype;

import java.io.*;

/**
 * @author baijianliang
 * @date 2019/9/18
 * @description
 */
public class ConcretePrototype extends Prototype implements Serializable {

    public DeepTarget deepTarget;

    // 浅克隆
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // 深克隆，方式一，使用clone方法
    public Object deepCloneOne() throws CloneNotSupportedException {
        ConcretePrototype prototype = (ConcretePrototype) super.clone();
        prototype.deepTarget = (DeepTarget)deepTarget.clone();
        return prototype;
    }

    // 深克隆，方式二，通过对象的序列化实现（推荐）
    public Object deepCloneTwo() throws IOException, ClassNotFoundException {
        // 将对象写到流里
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        // 从流中读取出来
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }
}
