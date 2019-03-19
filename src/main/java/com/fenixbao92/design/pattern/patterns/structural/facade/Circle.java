package com.fenixbao92.design.pattern.patterns.structural.facade;

/**
 * Create by fenixbao92 on 2019/3/19.
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
