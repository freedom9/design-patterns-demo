package com.freedom.composite;

/**
 * @author baijianliang
 * @date 2019/11/5
 * @description
 */
public class File extends Component {

    private String name;

    private String content;

    public File(String name, String content) {
        this.name = name;
        this.content = content;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println(getName());
    }

    @Override
    public String getContent() {
        return content;
    }
}
