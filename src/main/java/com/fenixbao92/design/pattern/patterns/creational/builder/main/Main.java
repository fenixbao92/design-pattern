package com.fenixbao92.design.pattern.patterns.creational.builder.main;

import com.fenixbao92.design.pattern.patterns.creational.builder.Burger;
import com.fenixbao92.design.pattern.patterns.creational.builder.Order;
import com.fenixbao92.design.pattern.patterns.creational.builder.OrderBuilder;
import com.fenixbao92.design.pattern.patterns.creational.builder.Suit;

/**
 * Create by fenixbao92 on 2019/3/14.
 */
public class Main {

    public static void main(String[] args) {
        Order order = new OrderBuilder()
                .burger(new Burger())
                .suit(new Suit())
                .build();
    }

}
