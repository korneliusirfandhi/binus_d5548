package class_2510_lc83.session07_refactoring.after;

class BookStrategy implements ProductStrategy {
    @Override
    public double applyTypePricing(double price, int quantity, PricingContext context) {
        price -= 5.0;
        if (quantity > 100) {
            price *= 0.95; // Extra 5% bulk discount
        }
        return price;
    }

    @Override
    public String getTypeName() {
        return "BOOK";
    }
}
