package com.freedom.memento;

/**
 * @author baijianliang
 * @date 2020/7/28 13:53
 */
public class Client {
    
    public static void main(String[] args) {
        
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        
        originator.setState("状态#1 攻击力100");
        caretaker.add(originator.createMemento());
        
        originator.setState("状态#2 攻击力80");
        caretaker.add(originator.createMemento());
                
        originator.setState("状态#3 攻击力50");
        caretaker.add(originator.createMemento());
        
        originator.restoreMemento(caretaker.get(1));
        System.out.println("回退一步：" + originator.getState());
        
        originator.restoreMemento(caretaker.get(0));
        System.out.println("回退两步：" + originator.getState());
    }
}