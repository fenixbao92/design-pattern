package com.fenixbao92.design.pattern.patterns.behavioral.visitor.main;

import com.fenixbao92.design.pattern.patterns.behavioral.visitor.Computer;
import com.fenixbao92.design.pattern.patterns.behavioral.visitor.ComputerPart;
import com.fenixbao92.design.pattern.patterns.behavioral.visitor.ComputerPartDisplayVisitor;

/**
 * Create by fenixbao92 on 2019/3/14.
 */
public class Main {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
