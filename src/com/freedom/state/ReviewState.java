package com.freedom.state;

public class ReviewState extends AbstractState {
    
    @Override
    public void makePriceEvent(Context context) {
        context.setState(new PublishState());
    }
    
    @Override
    public String getCurrentState() {
        return StateEnum.REVIEWED.getValue();
    }
}