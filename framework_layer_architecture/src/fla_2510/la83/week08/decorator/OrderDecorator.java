package fla_2510.la83.week08.decorator;

public class OrderDecorator implements Order {
    protected Order order;

    public OrderDecorator(Order order) {
        this.order = order;
    }

    @Override
    public String getInfo() {
        return order.getInfo();
    }

    @Override
    public double getPrice() {
        return order.getPrice();
    }
}
