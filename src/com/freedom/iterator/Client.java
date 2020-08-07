package com.freedom.iterator;

/**
 * @author baijianliang
 * @date 2019/12/5
 * @description
 */
public class Client {

    public static void main(String[] args) {

        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("小白");
        aggregate.add("小明");
        aggregate.add("小红");
        Iterator iterator = aggregate.createIterator();
        while(iterator.hasNext()) {
            System.out.println((String)iterator.next());
        }
    }
}
