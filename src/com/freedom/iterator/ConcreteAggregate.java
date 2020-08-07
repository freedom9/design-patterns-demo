package com.freedom.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author baijianliang
 * @date 2019/12/5
 * @description
 */
public class ConcreteAggregate implements Aggregate {
    public List list = new ArrayList();

    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(list);
    }
}