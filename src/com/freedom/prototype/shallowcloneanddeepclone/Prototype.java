package com.freedom.prototype.shallowcloneanddeepclone;

/**
 * @author baijianliang
 * @date 2019/9/18
 * @description
 */
public abstract class Prototype implements Cloneable {

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
