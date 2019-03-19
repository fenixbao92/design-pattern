package com.fenixbao92.design.pattern.patterns.structural.proxy.cglib.main;

import com.fenixbao92.design.pattern.patterns.structural.proxy.cglib.CglibProxy;
import com.fenixbao92.design.pattern.patterns.structural.proxy.cglib.Engineer;

/**
 * Create by fenixbao92 on 2019/3/15.
 */

//CGLIB(Code Generation Library)
public class Main {

    public static void main(String[] args) {
        // 生成 Cglib 代理类
        Engineer engineerProxy = (Engineer) CglibProxy.getProxy(new Engineer());
        // 调用相关方法
        engineerProxy.eat();
    }

}
