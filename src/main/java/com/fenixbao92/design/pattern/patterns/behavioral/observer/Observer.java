package com.fenixbao92.design.pattern.patterns.behavioral.observer;

/**
 * Create by fenixbao92 on 2019/3/19.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
