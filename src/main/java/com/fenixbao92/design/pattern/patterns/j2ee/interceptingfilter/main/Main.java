package com.fenixbao92.design.pattern.patterns.j2ee.interceptingfilter.main;

import com.fenixbao92.design.pattern.patterns.behavioral.chainofresponsibility.FilterManager;
import com.fenixbao92.design.pattern.patterns.j2ee.interceptingfilter.AuthenticationFilter;
import com.fenixbao92.design.pattern.patterns.j2ee.interceptingfilter.Client;
import com.fenixbao92.design.pattern.patterns.j2ee.interceptingfilter.DebugFilter;
import com.fenixbao92.design.pattern.patterns.j2ee.interceptingfilter.Target;

/**
 * Create by fenixbao92 on 2019/3/14.
 */
public class Main {
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }
}
