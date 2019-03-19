package com.fenixbao92.design.pattern.patterns.behavioral.state;

/**
 * Create by fenixbao92 on 2019/3/19.
 */
public class StartState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
