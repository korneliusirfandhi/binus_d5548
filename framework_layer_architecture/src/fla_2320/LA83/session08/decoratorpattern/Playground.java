package fla_2320.LA83.session08.decoratorpattern;

public class Playground extends Luxury {

    public Playground(Home home) {
        super(home);
        luxuryCost = 20000;
        System.out.println("You need extra pay to enjoy play ground : $ " + luxuryCost);
    }

    @Override
    public double getPrice() {
        return home.getPrice() + luxuryCost;
    }
}
