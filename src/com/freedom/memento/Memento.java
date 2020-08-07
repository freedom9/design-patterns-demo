package com.freedom.memento;

/**
 * @author baijianliang
 * @date 2020/7/28 13:53
 */
public class Memento {
    
    private String state;
    
    public Memento(String state) {
        this.state = state;
    }
    
    public String getState() {
        return state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
}