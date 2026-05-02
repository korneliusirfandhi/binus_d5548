package fla_2510.lb83.week08.decorator;

public class Protection extends OrderDecorator {

    public Protection(Order order) {
        super(order);
    }

    @Override
    public String getDetail() {
        return super.getDetail() + " + Protection";
    }

    @Override
    public double getAmount() {
        double protectionFee = super.getAmount() * 0.05 ;
        return super.getAmount() + protectionFee;
    }
}
