package com.fenixbao92.design.pattern.patterns.j2ee.compositeentity.main;

import com.fenixbao92.design.pattern.patterns.j2ee.compositeentity.Client;

/**
 * Create by fenixbao92 on 2019/3/14.
 */
public class Main {

    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }

}
