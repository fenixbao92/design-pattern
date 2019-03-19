package com.fenixbao92.design.pattern.patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;
/**
 * Create by fenixbao92 on 2019/3/19.
 */

public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
