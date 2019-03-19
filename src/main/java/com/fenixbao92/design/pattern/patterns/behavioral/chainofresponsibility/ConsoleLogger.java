package com.fenixbao92.design.pattern.patterns.behavioral.chainofresponsibility;

/**
 * Create by fenixbao92 on 2019/3/19.
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
