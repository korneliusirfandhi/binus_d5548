package class_2510_lc83.session07_refactoring.before;

import java.util.Date;

// Smell 1: Large Class (The God Object)
// This class handles pricing, inventory, logging, and status checks—too many responsibilities.
public class ProductService {

    // Smell 6: Temporary Field
    // This field is only used briefly inside calculateFinalPrice and is not part of the object's stable state.
    private double tempDiscountAmount;

    // Smell 2: Long Method
    // This method handles calculation, logging, and multiple conditional checks.
    public double calculateFinalPrice(Product product, int type, boolean applyVipDiscount, String logUser) {

        // Smell 9: Excessive Comments (Obvious/redundant comments)
        // This is where the initial price is set, based on the product's base price.
        double finalPrice = product.getBasePrice();

        // Check for promotion status before proceeding
        if (product.getProductStatus().equals("PROMO")) {
            finalPrice *= 0.85; // 15% promo discount
        }

        // Smell 3: Switch Statements / Conditional Complexity
        // Complex nested if-else structure instead of polymorphism or an Enum switch.
        if (type == 1) { // Book
            finalPrice -= 5.0;
            if (product.getQuantity() > 100) {
                finalPrice *= 0.95; // Extra 5% bulk discount for books
            }
        } else if (type == 2) { // Electronic
            finalPrice += finalPrice * 0.10; // 10% tax/fee for electronics
        } else if (type == 3) { // Apparel
            if (new Date().getHours() < 12) {
                finalPrice *= 0.90; // Morning discount
            }
        } else {
            // Log that an unknown product type was encountered
            System.err.println("LOG: Unknown product type encountered: " + type);
        }

        // Apply VIP discount if applicable
        if (applyVipDiscount) {
            tempDiscountAmount = finalPrice * 0.05; // Set temporary field
            finalPrice -= tempDiscountAmount;
        }

        // Smell 7: Shotgun Surgery / Divergent Change
        // Any change to logging, pricing, or status requires modifying this one massive method/class.
        logTransaction(logUser, product.getName(), finalPrice);

        return finalPrice;
    }

    // This method should probably be its own LoggingService
    private void logTransaction(String user, String productName, double price) {
        System.out.println("LOG: User " + user + " processed " + productName + " for $" + String.format("%.2f", price) + " at " + new Date());
    }
}
