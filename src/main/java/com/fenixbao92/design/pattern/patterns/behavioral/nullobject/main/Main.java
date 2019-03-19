package com.fenixbao92.design.pattern.patterns.behavioral.nullobject.main;

import com.fenixbao92.design.pattern.patterns.behavioral.nullobject.AbstractCustomer;
import com.fenixbao92.design.pattern.patterns.behavioral.nullobject.CustomerFactory;

/**
 * Create by fenixbao92 on 2019/3/14.
 */
public class Main {

    public static void main(String[] args) {

        AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
    }
}


