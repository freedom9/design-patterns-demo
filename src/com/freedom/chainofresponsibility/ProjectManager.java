package com.freedom.chainofresponsibility;

public class ProjectManager extends Handler {

    @Override
    public boolean handler(double fee) {
        if (fee <= 2000) {
            System.out.println("项目经理：审批通过。金额：" + fee);
            return true;
        } else {
            System.out.println("金额大于2000，项目经理无权审批，移交给部门经理!");
            return successor.handler(fee);
        }
    }
}