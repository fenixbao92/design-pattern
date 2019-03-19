package com.fenixbao92.design.pattern.patterns.j2ee.interceptingfilter;

import com.fenixbao92.design.pattern.patterns.behavioral.chainofresponsibility.FilterManager;

/**
 * Create by fenixbao92 on 2019/3/19.
 */
public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }
}
