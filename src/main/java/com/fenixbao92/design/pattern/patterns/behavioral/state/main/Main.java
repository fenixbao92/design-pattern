package com.fenixbao92.design.pattern.patterns.behavioral.state.main;

import com.fenixbao92.design.pattern.patterns.behavioral.state.Context;
import com.fenixbao92.design.pattern.patterns.behavioral.state.StartState;
import com.fenixbao92.design.pattern.patterns.behavioral.state.StopState;

/**
 * Create by fenixbao92 on 2019/3/14.
 */
public class Main {

    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }

}
