package com.freedom.strategy;

public class GoldMemberStrategy implements MemberStrategy {

    @Override
    public double calcPrice(double goodsPrice) {
        return goodsPrice * 0.75;
    }
}