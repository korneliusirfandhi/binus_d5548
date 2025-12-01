package class_2510_lc83.session07_refactoring.after;

class ElectronicStrategy implements ProductStrategy {
    @Override
    public double applyTypePricing(double price, int quantity, PricingContext context) {
        return price * 1.10; // 10% tax/fee
    }

    @Override
    public String getTypeName() {
        return "ELECTRONIC";
    }
}
