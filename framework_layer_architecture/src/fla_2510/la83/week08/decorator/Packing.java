package fla_2510.la83.week08.decorator;

import fla_2420.decorator.Decorator;

public class Packing extends OrderDecorator {

    public Packing(Order order) {
        super(order);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " - Extra Packing Service";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 5000.0;
    }
}
