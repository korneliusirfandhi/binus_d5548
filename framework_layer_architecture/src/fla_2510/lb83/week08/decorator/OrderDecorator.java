package fla_2510.lb83.week08.decorator;

public class OrderDecorator implements Order {
    private Order order;

    public OrderDecorator(Order order) {
        this.order = order;
    }

    @Override
    public String getDetail() {
        return order.getDetail();
    }

    @Override
    public double getAmount() {
        return order.getAmount();
    }
}
