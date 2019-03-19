package com.fenixbao92.design.pattern.patterns.behavioral.command;

/**
 * Create by fenixbao92 on 2019/3/19.
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
