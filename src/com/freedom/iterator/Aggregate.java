package com.freedom.iterator;

/**
 * @author baijianliang
 * @date 2019/12/5
 * @description
 */
public interface Aggregate {

    public void add(Object obj);

    public void remove(Object obj);

    public Iterator createIterator();
}