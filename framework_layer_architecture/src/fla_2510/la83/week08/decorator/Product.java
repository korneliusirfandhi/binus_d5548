package fla_2510.la83.week08.decorator;

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

    @Override
    public String getInfo() {
        return "Product";
    }

    public double getPrice() {
        return price;
    }

}
