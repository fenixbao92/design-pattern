package com.fenixbao92.design.pattern.patterns.builder;

public class OrderBuilder {

    private Burger mBurger;
    private Suit mSuit;

    //单点汉堡,num为数量
    public OrderBuilder burger(Burger burger) {
        mBurger = burger;
        return this;
    }

    //点套餐，实际中套餐也可以点多份
    public OrderBuilder suit(Suit suit) {
        mSuit = suit;
        return this;
    }

    //完成订单
    public Order build() {
        Order order = new Order();
        order.setmBurger(mBurger);
        order.setmSuit(mSuit);
        return order;
    }
}
