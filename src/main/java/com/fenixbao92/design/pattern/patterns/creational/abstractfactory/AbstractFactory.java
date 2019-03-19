package com.fenixbao92.design.pattern.patterns.creational.abstractfactory;

public abstract class AbstractFactory {
    //为什么有两个方法？因为有一个退化成工厂模式
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}

