package com.fenixbao92.design.pattern.patterns.builder.main;

import com.fenixbao92.design.pattern.patterns.builder.Burger;
import com.fenixbao92.design.pattern.patterns.builder.Order;
import com.fenixbao92.design.pattern.patterns.builder.OrderBuilder;
import com.fenixbao92.design.pattern.patterns.builder.Suit;

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
