package com.freedom.chainofresponsibility;

public class Manager extends Handler {
    
    @Override
    public boolean handler(double fee) {
        if (fee <= 10000) {
            System.out.println("总经理：审核通过。金额：" + fee);
            return true;
        } else {
            System.out.println("金额大于10000，审核不通过！申请金额：" + fee);
            return false;
        }
    }
}