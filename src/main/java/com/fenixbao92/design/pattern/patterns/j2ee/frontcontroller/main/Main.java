package com.fenixbao92.design.pattern.patterns.j2ee.frontcontroller.main;

import com.fenixbao92.design.pattern.patterns.j2ee.frontcontroller.FrontController;

/**
 * Create by fenixbao92 on 2019/3/14.
 */
public class Main {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
