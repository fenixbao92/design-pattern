package com.fenixbao92.design.pattern.patterns.behavioral.memento;

/**
 * Create by fenixbao92 on 2019/3/19.
 */
//*self add
public interface Memable {
    Memento saveStateToMemento();

    void getStateFromMemento(Memento Memento);
}
