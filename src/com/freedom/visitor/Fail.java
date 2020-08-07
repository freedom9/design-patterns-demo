package com.freedom.visitor;

/**
 * @author baijianliang
 * @date 2019/11/22
 * @description
 */
public class Fail implements Action {

    @Override
    public void getManResult(Man man) {
        System.out.println("男人给的评价是不通过！！！");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人给的评价是不通过！！！");
    }
}
