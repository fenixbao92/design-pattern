package com.fenixbao92.design.pattern.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by fenixbao92 on 2019/3/19.
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
