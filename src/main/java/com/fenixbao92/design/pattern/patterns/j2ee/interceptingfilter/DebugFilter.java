package com.fenixbao92.design.pattern.patterns.j2ee.interceptingfilter;

/**
 * Create by fenixbao92 on 2019/3/19.
 */
public class DebugFilter implements Filter {
    public void execute(String request){
        System.out.println("request log: " + request);
    }
}
