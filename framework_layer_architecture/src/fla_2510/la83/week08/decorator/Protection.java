package fla_2510.la83.week08.decorator;

public class Protection extends OrderDecorator {

    public Protection(Order order) {
        super(order);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " - Extra Protection";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 10000.0;
    }

}
