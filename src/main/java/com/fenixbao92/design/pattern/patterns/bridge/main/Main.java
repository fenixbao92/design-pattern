package com.fenixbao92.design.pattern.patterns.bridge.main;

import com.fenixbao92.design.pattern.patterns.bridge.*;

/**
 * Create by fenixbao92 on 2019/3/14.
 */
public class Main {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();

        //本来可以用shape的 这里要面向实现类了
        Circle1 someCircle = new Circle1(100,100, 10, new GreenCircle());
        someCircle.draw();
    }

}
