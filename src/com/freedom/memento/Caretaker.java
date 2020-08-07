package com.freedom.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author baijianliang
 * @date 2020/7/28 13:53
 */
public class Caretaker {
    
    private List<Memento> mementoList = new ArrayList<>();
    
    public void add(Memento memento) {
        mementoList.add(memento);
    }
    
    public Memento get(int index) {
        return mementoList.get(index);
    }
}