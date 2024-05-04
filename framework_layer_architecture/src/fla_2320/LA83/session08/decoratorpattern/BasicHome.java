package fla_2320.LA83.session08.decoratorpattern;

public class BasicHome extends Home {

    public BasicHome() {
        System.out.println("Standard basic home is ready for $ " + getPrice());
    }

    @Override
    public double getPrice() {
        return basePrice;
    }
}
