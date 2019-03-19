package com.fenixbao92.design.pattern.patterns.behavioral.nullobject;

/**
 * Create by fenixbao92 on 2019/3/19.
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}
