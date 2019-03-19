package com.fenixbao92.design.pattern.patterns.j2ee.businessdelegate;

/**
 * Create by fenixbao92 on 2019/3/19.
 */
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType){
        if(serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }else {
            return new JMSService();
        }
    }
}
