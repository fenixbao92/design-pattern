package com.fenixbao92.design.pattern.patterns.j2ee.businessdelegate;

/**
 * Create by fenixbao92 on 2019/3/19.
 */
public class EJBService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
