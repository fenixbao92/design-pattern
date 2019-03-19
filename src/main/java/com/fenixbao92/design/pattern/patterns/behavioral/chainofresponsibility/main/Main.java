package com.fenixbao92.design.pattern.patterns.behavioral.chainofresponsibility.main;

import com.fenixbao92.design.pattern.patterns.behavioral.chainofresponsibility.AbstractLogger;
import com.fenixbao92.design.pattern.patterns.behavioral.chainofresponsibility.ConsoleLogger;
import com.fenixbao92.design.pattern.patterns.behavioral.chainofresponsibility.ErrorLogger;
import com.fenixbao92.design.pattern.patterns.behavioral.chainofresponsibility.FileLogger;

/**
 * Create by fenixbao92 on 2019/3/14.
 */
public class Main {

    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is a debug level information.");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }

}
