package com.fenixbao92.design.pattern.patterns.behavioral.observer.main;

import com.fenixbao92.design.pattern.patterns.behavioral.observer.BinaryObserver;
import com.fenixbao92.design.pattern.patterns.behavioral.observer.HexaObserver;
import com.fenixbao92.design.pattern.patterns.behavioral.observer.OctalObserver;
import com.fenixbao92.design.pattern.patterns.behavioral.observer.Subject;

/**
 * Create by fenixbao92 on 2019/3/14.
 */
public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
