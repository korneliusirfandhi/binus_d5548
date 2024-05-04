package fla_2320.LA83.session08.decoratorpattern;

// decorator pattern
public abstract class Luxury extends Home {
    protected Home home; // wrapper
    public double luxuryCost;

    public Luxury(Home home) {
        this.home = home;
    }

    @Override
    public double getPrice() {
        return home.getPrice();
    }
}
