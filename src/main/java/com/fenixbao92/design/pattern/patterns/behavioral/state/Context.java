package com.fenixbao92.design.pattern.patterns.behavioral.state;

/**
 * Create by fenixbao92 on 2019/3/19.
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
