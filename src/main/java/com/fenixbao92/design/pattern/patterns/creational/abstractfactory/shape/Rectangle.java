package com.fenixbao92.design.pattern.patterns.creational.abstractfactory.shape;

import com.fenixbao92.design.pattern.patterns.creational.abstractfactory.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
