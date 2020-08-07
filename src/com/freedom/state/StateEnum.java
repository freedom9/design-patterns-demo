package com.freedom.state;

public enum StateEnum {
    
    GENERATE(1, "订单生成"),
    
    REVIEWED(2, "已审核"),
    
    PUBLISHED(3, "已发布"),
    
    NOT_PAY(4, "待付款"),
    
    PAID(5, "已付款"),
    
    FEED_BACKED(6, "已完结");
    
    private int key;
    
    private String value;
    
    StateEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }
    
    public int getKey() {
        return key;
    }
    
    public String getValue() {
        return value;
    }
}