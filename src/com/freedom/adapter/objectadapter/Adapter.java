package com.freedom.adapter.objectadapter;

/**
 * @author baijianliang
 * @date 2019/9/29
 * @description 将安卓手机的接口转化为苹果手机可用的充电接口
 */
public class Adapter implements Android {
    private Iphone iphone;

    public Adapter(Iphone iphone) {
        this.iphone = iphone;
    }

    @Override
    public void isAndroid() {
        iphone.isIphone();
    }
}
