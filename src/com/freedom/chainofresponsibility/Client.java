package com.freedom.chainofresponsibility;

public class Client {

    public static void main(String[] args) {
    
        ProjectManager pm = new ProjectManager();
        DepartmentManager dm = new DepartmentManager();
        Manager manager = new Manager();
        
        pm.setSuccessor(dm);
        dm.setSuccessor(manager);
        
        pm.handler(5500);
        System.out.println();

        dm.handler(1500);
        System.out.println();
        
        manager.handler(11111);    
    }
}