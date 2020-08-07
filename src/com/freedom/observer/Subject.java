package com.freedom.observer;

/**
 * @author baijianliang
 * @date 2019/12/9
 * @description
 */
public interface Subject {

    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}
