package com.freedom.strategy;

public class OrdinaryMemberStrategy implements MemberStrategy {

    @Override
    public double calcPrice(double goodsPrice) {
        return goodsPrice * 0.9;
    }
}