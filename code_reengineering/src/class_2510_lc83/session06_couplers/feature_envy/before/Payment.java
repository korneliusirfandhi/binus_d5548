package class_2510_lc83.session06_couplers.feature_envy.before;

public class Payment {
    private Product product;
    private int quantity;

    public Payment(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    // feature envy (based on fowler's theory)
    // case ada perhitungan product
    public double getDiscountPrice() {
        double originalPrice = product.getPrice();
        double discount = product.getDiscountPercentage();
        double priceAfterDiscount = (1 - (discount / 100)) * originalPrice;
        return priceAfterDiscount * quantity;
    }
}
