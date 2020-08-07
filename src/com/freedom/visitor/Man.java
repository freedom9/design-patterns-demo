package com.freedom.visitor;

/**
 * @author baijianliang
 * @date 2019/11/22
 * @description
 */
public class Man implements Person {

    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}