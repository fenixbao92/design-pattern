package com.fenixbao92.design.pattern.patterns.structural.flyweight.main;

import com.fenixbao92.design.pattern.patterns.structural.flyweight.Circle;
import com.fenixbao92.design.pattern.patterns.structural.flyweight.CircleFactory;

/**
 * Create by fenixbao92 on 2019/3/14.
 */
public class Main {

    private static final String colors[] =
            { "Red", "Green", "Blue", "White", "Black" };
    public static void main(String[] args) {

        for(int i=0; i < 20; ++i) {
            Circle circle = CircleFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }
    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }

}
