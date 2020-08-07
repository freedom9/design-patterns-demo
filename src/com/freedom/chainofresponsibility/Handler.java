package com.freedom.chainofresponsibility;

/**
 * @author baijianliang
 * @date 2020/8/7 15:21
 */
public abstract class Handler {

    protected Handler successor;

    public abstract boolean handler(double fee);

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}