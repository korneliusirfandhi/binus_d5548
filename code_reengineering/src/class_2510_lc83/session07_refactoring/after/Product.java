package class_2510_lc83.session07_refactoring.after;

// R4: Cleaned-up Product Class
class Product {
    private final String name;
    private final double basePrice;
    private final int quantity;
    private ProductStatus status;
    private final ProductStrategy pricingStrategy; // Delegation

    public Product(String name, double basePrice, int quantity, ProductStatus status, ProductStrategy strategy) {
        this.name = name;
        this.basePrice = basePrice;
        this.quantity = quantity;
        this.status = status;
        this.pricingStrategy = strategy;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public void setStatus(ProductStatus status) {
        this.status = status;
    }

    // R5: Extract Method / Small Method (Addresses Long Method - Smell 2)
    public double calculateFinalPrice(PricingContext context) {
        double price = basePrice;

        // R5.1: Apply general promotions first
        if (status.equals(ProductStatus.PROMO)) {
            price *= 0.85;
        }

        // R5.2: Delegate to the correct strategy (Polymorphism)
        price = pricingStrategy.applyTypePricing(price, quantity, context);

        // R5.3: Apply VIP discount
        if (context.isVip()) {
            // R5.4: Temporary Field removed (Smell 6) - calculation is local and returned, not stored
            double vipDiscount = price * 0.05;
            price -= vipDiscount;
        }

        return price;
    }

    // R6: Product now handles its own summary (Addresses Feature Envy/Inappropriate Intimacy Smells 5 & 11)
    public String generateSummary() {
        double inventoryValue = basePrice * quantity;
        return String.format("Summary: %s (%s). Type: %s. Value: $%.2f. Units: %d.",
            name,
            status.getDisplayStatus(), // Self-knowledge
            pricingStrategy.getTypeName(), // Delegation
            inventoryValue,
            quantity);
    }
}
