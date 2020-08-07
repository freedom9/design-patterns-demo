package com.freedom.strategy;

public class Client {
    
    public static void main(String[] args) {
        
        double originPrice = 10;
        System.out.println("商品原价：" + originPrice);
        
        Price ordinaryPrice = new Price(new OrdinaryMemberStrategy());
        System.out.println("普通会员折扣后的商品价格：" + ordinaryPrice.quote(originPrice));
        
        Price goldPrice = new Price(new GoldMemberStrategy());
        System.out.println("黄金会员折扣后的商品价格：" + goldPrice.quote(originPrice));
    }
}