package class_2510_lc83.session07_refactoring.after;

// R3: Using Polymorphism to replace the Switch Statement (Smell 3)
interface ProductStrategy {
    // The strategy is responsible for applying its specific discounts/taxes
    double applyTypePricing(double basePrice, int quantity, PricingContext context);

    String getTypeName();
}
