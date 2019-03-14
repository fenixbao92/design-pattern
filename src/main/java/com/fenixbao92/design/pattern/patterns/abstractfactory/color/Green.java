package com.fenixbao92.design.pattern.patterns.abstractfactory.color;

import com.fenixbao92.design.pattern.patterns.abstractfactory.Color;

public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
