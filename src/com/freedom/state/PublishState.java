package com.freedom.state;

public class PublishState extends AbstractState {
    
    @Override
    public void acceptOrderEvent(Context context) {
        context.setState(new NotPayState());
    }
    
    @Override
    public void notPeopleAcceptEvent(Context context) {
        context.setState(new FeedBackState());
    }
    
    @Override
    public String getCurrentState() {
        return StateEnum.PUBLISHED.getValue();
    }
}