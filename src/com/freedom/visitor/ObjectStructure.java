package com.freedom.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author baijianliang
 * @date 2019/11/22
 * @description
 */
public class ObjectStructure {

    private List<Person> persons = new ArrayList<>();

    public void add(Person person) {
        persons.add(person);
    }

    public void remove(Person person) {
        persons.remove(person);
    }

    public void display(Action action) {
        for (Person person : persons) {
            person.accept(action);
        }
    }
}