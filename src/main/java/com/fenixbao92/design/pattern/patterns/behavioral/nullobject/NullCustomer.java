package com.fenixbao92.design.pattern.patterns.behavioral.nullobject;

/**
 * Create by fenixbao92 on 2019/3/19.
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
