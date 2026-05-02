package fla_2510.lb83.week08.decorator;

public class Packing extends OrderDecorator {

    public Packing(Order order) {
        super(order);
    }

    @Override
    public String getDetail() {
        return super.getDetail() + " + Extra Packing";
    }

    @Override
    public double getAmount() {
        return super.getAmount() + 5.0;
    }
}
