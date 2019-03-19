package com.fenixbao92.design.pattern.patterns.creational.builder;

public class Order {

    private Burger mBurger;
    private Suit mSuit;

    public Burger getmBurger() {
        return mBurger;
    }

    public void setmBurger(Burger mBurger) {
        this.mBurger = mBurger;
    }

    public Suit getmSuit() {
        return mSuit;
    }

    public void setmSuit(Suit mSuit) {
        this.mSuit = mSuit;
    }

}
