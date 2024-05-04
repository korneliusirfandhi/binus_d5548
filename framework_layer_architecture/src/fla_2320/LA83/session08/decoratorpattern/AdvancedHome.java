package fla_2320.LA83.session08.decoratorpattern;

public class AdvancedHome extends Home {

    public AdvancedHome() {
        additionalCost = 25000;
        System.out.println("This home is ready for any facilities, " +
            "you need to pay $ " + getPrice());

    }

    @Override
    public double getPrice() {
        return basePrice + additionalCost;
    }
}
