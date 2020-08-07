package com.freedom.state;

public class Client {
    
    public static void main(String[] args) {
        
        Context context = new Context();
        context.setState(new PublishState());
        
        context.acceptOrderEvent(context);
        
        context.payOrderEvent(context);

        try {
            context.checkFailEvent(context);
            System.out.println("流程正常。。。");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}