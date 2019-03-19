package com.fenixbao92.design.pattern.patterns.behavioral.memento;

/**
 * Create by fenixbao92 on 2019/3/19.
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
