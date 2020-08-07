package com.freedom.template;

/**
 * @author baijianliang
 * @date 2019/11/15
 * @description
 */
public class OriginalSoyMilk extends SoyMilk {

    @Override
    public void addCondiments() {}

    @Override
    protected boolean customerWantCondiments() {
        return false;
    }
}
