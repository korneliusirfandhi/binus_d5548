package class_2510_lc83.session06_couplers.feature_envy.after;

public class Payment {
    private Product product;
    private int quantity;

    public Payment(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getDiscountPrice() {
        return product.getDiscountPrice() * quantity;
    }
}
