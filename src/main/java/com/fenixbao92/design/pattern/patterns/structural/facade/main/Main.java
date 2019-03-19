package com.fenixbao92.design.pattern.patterns.structural.facade.main;

import com.fenixbao92.design.pattern.patterns.structural.facade.ShapeMaker;

/**
 * Create by fenixbao92 on 2019/3/14.
 */
public class Main {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
