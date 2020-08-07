package com.freedom.strategy;

public class Price {
    
    private MemberStrategy strategy;
    
    public Price(MemberStrategy strategy) {
        this.strategy = strategy;
    }
    
    public double quote(double goodsPrice) {
        return strategy.calcPrice(goodsPrice);
    }
}