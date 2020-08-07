package com.freedom.adapter.classadapter;

/**
* 将安卓手机的接口转化为苹果手机可用的充电接口
*/
public class Adapter extends Iphone implements Android {

    @Override
    public void isAndroid() {
        isIphone();
    }
}