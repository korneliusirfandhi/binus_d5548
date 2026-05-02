package fla_2510.lb83.week08.decorator;

public class Product implements Order {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String getDetail() {
        return "Standard Product";
    }

    @Override
    public double getAmount() {
        return getPrice();
    }
}
