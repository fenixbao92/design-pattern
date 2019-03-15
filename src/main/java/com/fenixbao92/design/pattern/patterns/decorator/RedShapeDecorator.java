package com.fenixbao92.design.pattern.patterns.decorator;

/**
 * Create by fenixbao92 on 2019/3/15.
 */

//可不抽象ShapeDecorator 直接作为实现类对代理的Shape对象的方法进行扩展 如ShapeDecorator1
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
