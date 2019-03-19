package com.fenixbao92.design.pattern.patterns.behavioral.visitor;

/**
 * Create by fenixbao92 on 2019/3/19.
 */
public class Keyboard  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
