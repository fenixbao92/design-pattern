package com.fenixbao92.design.pattern.patterns.abstractfactory.shape;

import com.fenixbao92.design.pattern.patterns.abstractfactory.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
