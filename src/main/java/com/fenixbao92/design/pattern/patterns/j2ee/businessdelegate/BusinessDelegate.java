package com.fenixbao92.design.pattern.patterns.j2ee.businessdelegate;

/**
 * Create by fenixbao92 on 2019/3/19.
 */
public class BusinessDelegate {
    private BusinessLookUp lookupService = new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType){
        this.serviceType = serviceType;
    }

    public void doTask(){
        businessService = lookupService.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
