package com.fenixbao92.design.pattern.patterns.behavioral.chainofresponsibility;

import com.fenixbao92.design.pattern.patterns.j2ee.interceptingfilter.Filter;
import com.fenixbao92.design.pattern.patterns.j2ee.interceptingfilter.FilterChain;
import com.fenixbao92.design.pattern.patterns.j2ee.interceptingfilter.Target;

/**
 * Create by fenixbao92 on 2019/3/19.
 */
public class FilterManager {
    FilterChain filterChain;

    public FilterManager(Target target){
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }
    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request){
        filterChain.execute(request);
    }
}
