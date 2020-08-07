package com.freedom.chainofresponsibility;

public class DepartmentManager extends Handler {
    
    @Override
    public boolean handler(double fee) {
        if (fee <= 5000) {
            System.out.println("部门经理：审批通过。金额：" + fee);
            return true;
        } else {
            System.out.println("金额大于5000，部门经理无权审批，移交给总经理!");
            return successor.handler(fee);
        }
    }
}