package com.freedom.state;

public class GenerateState extends AbstractState {
    
    @Override
    public void checkEvent(Context context) {
        context.setState(new ReviewState());
    }
    
    @Override
    public void checkFailEvent(Context context) {
        context.setState(new FeedBackState());
    }
    
    @Override
    public String getCurrentState() {
        return StateEnum.GENERATE.getValue();
    }
}