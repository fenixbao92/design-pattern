package com.fenixbao92.design.pattern.patterns.j2ee.servicelocator;

/**
 * Create by fenixbao92 on 2019/3/19.
 */
public class Service2 implements Service {
    public void execute(){
        System.out.println("Executing Service2");
    }

    @Override
    public String getName() {
        return "Service2";
    }
}
