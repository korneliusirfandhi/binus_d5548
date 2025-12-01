package class_2510_lc83.session07_refactoring.after;

// R8: Cleaned-up Core Service (Formerly ProductService, now only coordinates)
// Addresses Large Class (Smell 1)
class OrderService {
    private final LoggingService loggingService;
    private final int currentHour;

    public OrderService(LoggingService loggingService, int currentHour) {
        this.loggingService = loggingService;
        this.currentHour = currentHour;
    }

    public double finalizeOrder(Product product, boolean applyVipDiscount, String logUser) {
        // R8.1: Encapsulate the data clumps into a context object
        PricingContext context = new PricingContext(applyVipDiscount, currentHour);

        // R8.2: Delegation to Product for the complex calculation
        double finalPrice = product.calculateFinalPrice(context);

        // R8.3: Delegation to LoggingService for logging
        loggingService.logTransaction(logUser, product.getName(), finalPrice);

        return finalPrice;
    }
}
