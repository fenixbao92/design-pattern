package com.fenixbao92.design.pattern.patterns.structural.bridge;

public class Circle1 {
    private int x, y, radius;
    DrawAPI drawAPI;

    public Circle1(int x, int y, int radius, DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
