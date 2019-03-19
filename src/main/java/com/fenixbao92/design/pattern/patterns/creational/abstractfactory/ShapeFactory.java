package com.fenixbao92.design.pattern.patterns.creational.abstractfactory;

import com.fenixbao92.design.pattern.patterns.creational.abstractfactory.shape.Circle;
import com.fenixbao92.design.pattern.patterns.creational.abstractfactory.shape.Rectangle;
import com.fenixbao92.design.pattern.patterns.creational.abstractfactory.shape.Square;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}