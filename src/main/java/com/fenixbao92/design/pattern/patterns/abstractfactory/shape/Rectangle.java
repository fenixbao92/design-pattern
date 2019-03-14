package com.fenixbao92.design.pattern.patterns.abstractfactory.shape;

import com.fenixbao92.design.pattern.patterns.abstractfactory.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
