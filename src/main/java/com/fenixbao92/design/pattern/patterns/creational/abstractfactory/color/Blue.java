package com.fenixbao92.design.pattern.patterns.creational.abstractfactory.color;

import com.fenixbao92.design.pattern.patterns.creational.abstractfactory.Color;

public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
