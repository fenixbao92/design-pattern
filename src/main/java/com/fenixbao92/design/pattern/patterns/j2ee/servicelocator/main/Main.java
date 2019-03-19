package com.fenixbao92.design.pattern.patterns.j2ee.servicelocator.main;

import com.fenixbao92.design.pattern.patterns.j2ee.servicelocator.Service;
import com.fenixbao92.design.pattern.patterns.j2ee.servicelocator.ServiceLocator;

/**
 * Create by fenixbao92 on 2019/3/14.
 */
public class Main {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
    }
}
