package com.fenixbao92.design.pattern.patterns.j2ee.servicelocator;

/**
 * Create by fenixbao92 on 2019/3/19.
 */
public class ServiceLocator {
    private static Cache cache;

    static {
        cache = new Cache();
    }

    public static Service getService(String jndiName){

        Service service = cache.getService(jndiName);

        if(service != null){
            return service;
        }

        InitialContext context = new InitialContext();
        Service service1 = (Service)context.lookup(jndiName);
        cache.addService(service1);
        return service1;
    }
}
