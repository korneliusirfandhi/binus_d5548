package class_2510_lc83.session06_couplers.feature_envy.after;

public class Product {
    private String name;
    private double price;
    private double discountPercentage;

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

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

    public double getDiscountPrice() {
        return (1 - (discountPercentage / 100)) * price;
    }

}
