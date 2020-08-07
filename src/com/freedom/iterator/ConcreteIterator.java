package com.freedom.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author baijianliang
 * @date 2019/12/5
 * @description
 */
public class ConcreteIterator implements Iterator {

    private List list = new ArrayList();
    private int position = 0;

    public ConcreteIterator(List list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position != list.size();
    }

    @Override
    public Object next() {
        Object obj = null;
        if (hasNext()) {
            obj = list.get(position++);
        }
        return obj;
    }
}
