package com.freedom.state;

public class NotPayState extends AbstractState {

    @Override
    public void payOrderEvent(Context context) {
        context.setState(new PaidState());
    }
    
    @Override
    public void feedBackEvent(Context context) {
        context.setState(new FeedBackState());
    }
    
    @Override
    public String getCurrentState() {
        return StateEnum.NOT_PAY.getValue();
    }
}