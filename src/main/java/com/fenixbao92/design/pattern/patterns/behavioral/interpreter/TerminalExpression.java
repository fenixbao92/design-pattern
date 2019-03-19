package com.fenixbao92.design.pattern.patterns.behavioral.interpreter;

/**
 * Create by fenixbao92 on 2019/3/19.
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
