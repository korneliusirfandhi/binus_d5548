package fla_2320.LA83.session08.decoratorpattern;

public class SwimmingPool extends Luxury {
    public SwimmingPool(Home home) {
        super(home);
        luxuryCost = 55000;
        System.out.println("Need to extra pay for swimming pool : $ " + luxuryCost);
    }

    @Override
    public double getPrice() {
        return home.getPrice() + luxuryCost;
    }
}
