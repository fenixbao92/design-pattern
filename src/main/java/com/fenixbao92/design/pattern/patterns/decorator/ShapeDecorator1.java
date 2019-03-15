package com.fenixbao92.design.pattern.patterns.decorator;

/**
 * Create by fenixbao92 on 2019/3/15.
 */
public class ShapeDecorator1 implements Shape {

    private Shape decoratedShape;

    public ShapeDecorator1(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
        setSomeBorder(decoratedShape);
    }

    private void setSomeBorder(Shape decoratedShape){
        System.out.println("Border Color: Some");
    }

}
