package com.fenixbao92.design.pattern.patterns.behavioral.command;

/**
 * Create by fenixbao92 on 2019/3/19.
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
