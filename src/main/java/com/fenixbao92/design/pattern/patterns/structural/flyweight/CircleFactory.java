package com.fenixbao92.design.pattern.patterns.structural.flyweight;

import java.util.HashMap;

/**
 * Create by fenixbao92 on 2019/3/19.
 */
public class CircleFactory {
    private static final HashMap<String, Circle> circleMap = new HashMap<>();

    public static Circle getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
