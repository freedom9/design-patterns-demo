package com.freedom.state;

public abstract class AbstractState implements State {
    
    protected static final RuntimeException NO_ALLOW_EXCEPTION = new RuntimeException("操作流程不允许");
    
    @Override
    public void checkEvent(Context context) {
        throw NO_ALLOW_EXCEPTION;
    }
    
    @Override
    public void checkFailEvent(Context context) {
        throw NO_ALLOW_EXCEPTION;
    }
    
    @Override
    public void makePriceEvent(Context context) {
        throw NO_ALLOW_EXCEPTION;
    }
    
    @Override
    public void acceptOrderEvent(Context context) {
        throw NO_ALLOW_EXCEPTION;
    }
    
    @Override
    public void notPeopleAcceptEvent(Context context) {
        throw NO_ALLOW_EXCEPTION;
    }
    
    @Override
    public void payOrderEvent(Context context) {
        throw NO_ALLOW_EXCEPTION;
    }
    
    @Override
    public void orderFailureEvent(Context context) { 
        throw NO_ALLOW_EXCEPTION;
    }
    
    @Override
    public void feedBackEvent(Context context) {
        throw NO_ALLOW_EXCEPTION;
    }
    
    @Override
    public String getCurrentState() {
        throw NO_ALLOW_EXCEPTION;
    }
}