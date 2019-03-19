package com.fenixbao92.design.pattern.patterns.structural.mediator;

import java.util.Date;
/**
 * Create by fenixbao92 on 2019/3/19.
 */

public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
