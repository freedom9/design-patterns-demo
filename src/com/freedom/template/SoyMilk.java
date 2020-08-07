package com.freedom.template;

/**
 * @author baijianliang
 * @date 2019/11/15
 * @description
 */
public abstract class SoyMilk {

    public final void make() {
        select();
        if (customerWantCondiments()) {
            addCondiments();
        }
        soak();
        beat();
    }

    public void select() {
        System.out.println("选择上好的新鲜黄豆。");
    }

    public abstract void addCondiments();

    public void soak() {
        System.out.println("浸泡三小时原料。");
    }

    public void beat() {
        System.out.println("放入到豆浆机打碎。");
    }

    // 钩子方法，决定是否需要添加配料
    protected boolean customerWantCondiments() {
        return true;
    }

}