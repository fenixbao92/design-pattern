package com.fenixbao92.design.pattern.patterns.behavioral.visitor;

/**
 * Create by fenixbao92 on 2019/3/19.
 */
public interface ComputerPartVisitor {

    void visit(Computer computer);

    void visit(Mouse mouse);

    void visit(Keyboard keyboard);

    void visit(Monitor monitor);

}