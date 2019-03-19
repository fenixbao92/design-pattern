package com.fenixbao92.design.pattern.patterns.behavioral.mediator.main;

import com.fenixbao92.design.pattern.patterns.behavioral.mediator.User;

/**
 * Create by fenixbao92 on 2019/3/14.
 */
public class Main {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
