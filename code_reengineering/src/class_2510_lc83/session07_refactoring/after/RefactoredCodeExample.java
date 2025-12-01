package class_2510_lc83.session07_refactoring.after;

import java.util.Date;
import java.util.List;

public class RefactoredCodeExample {

    public static void main(String[] args) {

        // We simulate the current hour for Apparel pricing logic
        int currentHour = new Date().getHours();

        // --- Setup Clean Objects ---
        Product book = new Product("The Refactoring Guide", 45.00, 150, ProductStatus.PROMO, new BookStrategy());
        Product phone = new Product("Smart Phone 9000", 999.99, 50, ProductStatus.ACTIVE, new ElectronicStrategy());

        // Instantiate the dedicated services
        LoggingService loggingService = new LoggingService();
        OrderService orderService = new OrderService(loggingService, currentHour);

        // --- Demonstrate Clean Code ---

        System.out.println("--- Order Service (Clean: Modular, Small Methods, Polymorphism) ---");

        // Simple call: OrderService delegates to Product and Logging
        double bookPrice = orderService.finalizeOrder(book, true, "AdminUser");
        System.out.println("Final Book Price: $" + String.format("%.2f", bookPrice));

        double phonePrice = orderService.finalizeOrder(phone, false, "GuestUser");
        System.out.println("Final Phone Price: $" + String.format("%.2f", phonePrice));


        System.out.println("\n--- Product Summaries (Clean: Product is responsible for its own data) ---");
        // The Product generates its own summary, eliminating Feature Envy/Inappropriate Intimacy
        System.out.println(book.generateSummary());
        System.out.println(phone.generateSummary());


        System.out.println("\n--- Clean Utilities (Clean: Common logic extracted, no duplication) ---");
        List<String> data = List.of("data1", "data2", "data3");
        System.out.println("Result A: " + Utils.processA(data));
        System.out.println("Result B: " + Utils.processB(data));
    }
}
