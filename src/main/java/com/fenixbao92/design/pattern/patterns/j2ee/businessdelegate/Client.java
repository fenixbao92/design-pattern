package com.fenixbao92.design.pattern.patterns.j2ee.businessdelegate;

/**
 * Create by fenixbao92 on 2019/3/19.
 */
public class Client {

    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService){
        this.businessService  = businessService;
    }

    public void doTask(){
        businessService.doTask();
    }
}
