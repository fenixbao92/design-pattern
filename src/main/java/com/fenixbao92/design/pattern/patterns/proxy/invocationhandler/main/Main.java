package com.fenixbao92.design.pattern.patterns.proxy.invocationhandler.main;

import com.fenixbao92.design.pattern.patterns.proxy.invocationhandler.MyInvocationHandler;
import com.fenixbao92.design.pattern.patterns.proxy.invocationhandler.RealSubject;
import com.fenixbao92.design.pattern.patterns.proxy.invocationhandler.Subject;

import java.lang.reflect.Proxy;

/**
 * Create by fenixbao92 on 2019/3/15.
 */
public class Main {
    public static void main(String[] args) {
        //真实对象
        Subject realSubject =  new RealSubject();

        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(realSubject);
        //代理对象
        Subject proxyClass = (Subject) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Subject.class}, myInvocationHandler);

        proxyClass.sellBooks();

        proxyClass.speak();
    }
}
