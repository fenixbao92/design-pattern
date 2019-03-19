package com.fenixbao92.design.pattern.patterns.structural.decorator;

/**
 * Create by fenixbao92 on 2019/3/15.
 */
//可不抽象ShapeDecorator 直接作为实现类对代理的Shape对象的方法进行扩展 如ShapeDecorator1
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}