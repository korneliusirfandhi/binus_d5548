package class_2510_lc83.session07_refactoring.after;

class ApparelStrategy implements ProductStrategy {
    @Override
    public double applyTypePricing(double price, int quantity, PricingContext context) {
        if (context.isMorning()) {
            price *= 0.90; // Morning discount
        }
        return price;
    }

    @Override
    public String getTypeName() {
        return "APPAREL";
    }
}
