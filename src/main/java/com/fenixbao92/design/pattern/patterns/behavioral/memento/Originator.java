package com.fenixbao92.design.pattern.patterns.behavioral.memento;

/**
 * Create by fenixbao92 on 2019/3/19.
 */
public class Originator implements Memable{
    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    @Override
    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    @Override
    public void getStateFromMemento(Memento Memento){
        state = Memento.getState();
    }
}
