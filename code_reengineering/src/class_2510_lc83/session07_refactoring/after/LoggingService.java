package class_2510_lc83.session07_refactoring.after;

import java.util.Date;

// R7: Extracted Service (Addresses Large Class - Smell 1, Shotgun Surgery - Smell 7)
// Any change to logging only affects this class.
class LoggingService {
    public void logTransaction(String user, String productName, double price) {
        // R7.1: Removed excessive comment (Smell 9)
        System.out.println("LOG: User " + user + " processed " + productName + " for $" + String.format("%.2f", price) + " at " + new Date());
    }
}
