package com.freedom.state;

/**
 * @author baijianliang
 * @date 2020/8/4 16:08
 */
public interface State {

    /**
     * 电审
     */
    void checkEvent(Context context);

    /**
     * 电商失败
     */
    void checkFailEvent(Context context);

    /**
     * 定价发布
     */
    void makePriceEvent(Context context);

    /**
     * 接单
     */
    void acceptOrderEvent(Context context);

    /**
     * 无人接单失效
     */
    void notPeopleAcceptEvent(Context context);

    /**
     * 付款
     */
    void payOrderEvent(Context context);

    /**
     * 有人接单支付失效
     */
    void orderFailureEvent(Context context);

    /**
     * 反馈
     */
    void feedBackEvent(Context context);

    String getCurrentState();
}
