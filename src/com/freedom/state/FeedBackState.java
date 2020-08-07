package com.freedom.state;

public class FeedBackState extends AbstractState {
    
    @Override
    public String getCurrentState() {
        return StateEnum.FEED_BACKED.getValue();
    }
}