package com.fenixbao92.design.pattern.patterns.behavioral.interpreter.main;

import com.fenixbao92.design.pattern.patterns.behavioral.interpreter.AndExpression;
import com.fenixbao92.design.pattern.patterns.behavioral.interpreter.Expression;
import com.fenixbao92.design.pattern.patterns.behavioral.interpreter.OrExpression;
import com.fenixbao92.design.pattern.patterns.behavioral.interpreter.TerminalExpression;

/**
 * Create by fenixbao92 on 2019/3/14.
 */
public class Main {

    //规则：Robert 和 John 是男性
    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    //规则：Julie 是一个已婚的女性
    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? "
                + isMarriedWoman.interpret("Married Julie"));
    }

}
