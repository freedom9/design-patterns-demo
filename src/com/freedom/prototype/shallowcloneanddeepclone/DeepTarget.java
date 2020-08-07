package com.freedom.prototype.shallowcloneanddeepclone;

import java.io.Serializable;

/**
 * @author baijianliang
 * @date 2019/9/18
 * @description
 */
public class DeepTarget implements Cloneable, Serializable{

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName(String name) {
        return name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}