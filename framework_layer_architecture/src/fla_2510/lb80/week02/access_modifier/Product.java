package fla_2510.lb80.week02.access_modifier;

public class Product {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    protected void info() {
        System.out.println("Protected Method.");
    }

    void sampleNoAccessModifierMethod() {
        System.out.println("sampleNoAccessModifierMethod");
    }
}
