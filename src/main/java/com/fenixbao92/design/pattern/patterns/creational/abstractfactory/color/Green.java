package com.fenixbao92.design.pattern.patterns.creational.abstractfactory.color;

import com.fenixbao92.design.pattern.patterns.creational.abstractfactory.Color;

public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
