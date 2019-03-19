package com.fenixbao92.design.pattern.patterns.behavioral.observer;

/**
 * Create by fenixbao92 on 2019/3/19.
 */
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}
