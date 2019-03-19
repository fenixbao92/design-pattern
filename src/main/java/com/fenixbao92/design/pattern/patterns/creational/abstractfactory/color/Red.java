package com.fenixbao92.design.pattern.patterns.creational.abstractfactory.color;

import com.fenixbao92.design.pattern.patterns.creational.abstractfactory.Color;

public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
