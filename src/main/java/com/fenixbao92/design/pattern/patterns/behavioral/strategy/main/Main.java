package com.fenixbao92.design.pattern.patterns.behavioral.strategy.main;

import com.fenixbao92.design.pattern.patterns.behavioral.strategy.Context;
import com.fenixbao92.design.pattern.patterns.behavioral.strategy.OperationAdd;
import com.fenixbao92.design.pattern.patterns.behavioral.strategy.OperationMultiply;
import com.fenixbao92.design.pattern.patterns.behavioral.strategy.OperationSubstract;

/**
 * Create by fenixbao92 on 2019/3/14.
 */
public class Main {
    public static void main(String[] args) {

        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

    }
}
