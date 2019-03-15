package com.fenixbao92.design.pattern.patterns.decorator.main;

import com.fenixbao92.design.pattern.patterns.decorator.*;

/**
 * Create by fenixbao92 on 2019/3/14.
 */
public class Main {

    public static void main(String[] args) {

        Shape circle = new Circle();

        System.out.println("Circle with normal border");
        circle.draw();

        Shape redCircle = new RedShapeDecorator(new Circle());

        System.out.println("\nCircle of red border");
        redCircle.draw();

        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("\nRectangle of red border");
        redRectangle.draw();

        Shape someCircle = new ShapeDecorator1(new Circle());

        System.out.println("\nCircle of some border");
        someCircle.draw();


    }

}
