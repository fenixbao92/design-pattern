package com.fenixbao92.design.pattern.patterns.proxy.invocationhandler;

/**
 * Create by fenixbao92 on 2019/3/15.
 */
public class RealSubject implements Subject{
    @Override
    public int sellBooks() {
        System.out.println("卖书");
        return 1 ;
    }

    @Override
    public String speak() {
        System.out.println("说话");
        return "张三";
    }
}
