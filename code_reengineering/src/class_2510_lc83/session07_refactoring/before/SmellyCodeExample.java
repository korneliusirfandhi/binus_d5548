package class_2510_lc83.session07_refactoring.before;

import java.util.List;

public class SmellyCodeExample {

    public static void main(String[] args) {
        // --- Setup Smelly Objects ---
        Product book = new Product("The Refactoring Guide", 45.00, 150, "PROMO", 1);
        Product phone = new Product("Smart Phone 9000", 999.99, 50, "ACTIVE", 2);

        ProductService service = new ProductService();
        ReportGenerator reportGen = new ReportGenerator();

        // --- Demonstrate Smells ---

        System.out.println("--- Product Service (Smells: Large Class, Long Method, Switch Statements, Data Clumps, Temporary Field) ---");

        // Calling Long Method with Data Clumps (product, type, discount flag, user)
        double bookPrice = service.calculateFinalPrice(book, book.getProductType(), true, "AdminUser");
        System.out.println("Final Book Price: $" + String.format("%.2f", bookPrice));

        // Check state change due to Temporary Field (should be 0, but is not encapsulated)
        // If 'tempDiscountAmount' were public, this would show the smell clearer, but even private
        // usage indicates poor design leading to hidden state.

        double phonePrice = service.calculateFinalPrice(phone, phone.getProductType(), false, "GuestUser");
        System.out.println("Final Phone Price: $" + String.format("%.2f", phonePrice));


        System.out.println("\n--- Report Generator (Smells: Feature Envy, Inappropriate Intimacy) ---");
        System.out.println(reportGen.generateProductSummary(book));
        System.out.println(reportGen.generateProductSummary(phone));


        System.out.println("\n--- Legacy Utils (Smells: Duplicate Code, Dead Code, Excessive Comments) ---");
        LegacyUtils utils = new LegacyUtils();
        List<String> data = List.of("item1", "item2", "item3");
        System.out.println("Result A: " + utils.duplicateProcess(data));
        System.out.println("Result B (Duplicate Logic): " + utils.anotherProcess(data));
    }
}
