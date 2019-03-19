package com.fenixbao92.design.pattern.patterns.creational.abstractfactory;

import com.fenixbao92.design.pattern.patterns.creational.abstractfactory.color.Blue;
import com.fenixbao92.design.pattern.patterns.creational.abstractfactory.color.Green;
import com.fenixbao92.design.pattern.patterns.creational.abstractfactory.color.Red;

public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        return null;
    }

    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }
}
