package com.fenixbao92.design.pattern.patterns.behavioral.command.main;

import com.fenixbao92.design.pattern.patterns.behavioral.command.Broker;
import com.fenixbao92.design.pattern.patterns.behavioral.command.BuyStock;
import com.fenixbao92.design.pattern.patterns.behavioral.command.SellStock;
import com.fenixbao92.design.pattern.patterns.behavioral.command.Stock;

/**
 * Create by fenixbao92 on 2019/3/14.
 */
public class Main {

    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }

}
