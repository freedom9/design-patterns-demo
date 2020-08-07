package com.freedom.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author baijianliang
 * @date 2019/11/5
 * @description
 */
public class Folder extends Component {

    private String name;
    private List<Component> componentList = new ArrayList<>();
    private int level;

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void add(Component component) {
        componentList.add(component);
    }

    @Override
    public void remove(Component component) {
        componentList.remove(component);
    }

    @Override
    public void print() {
        System.out.println(getName());
        if (level == 0) {
            level = 1;
        }
        String prefix = "";
        for (int i = 0; i < level; i++) {
            prefix += "\t- ";
        }
        for (Component component : componentList) {
            if (component instanceof Folder) {
                ((Folder)component).level = level + 1;
            }
            System.out.print(prefix);
            component.print();
        }
        level = 0;
    }
}