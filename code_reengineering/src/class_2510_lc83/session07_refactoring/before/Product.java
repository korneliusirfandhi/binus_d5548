package class_2510_lc83.session07_refactoring.before;

// Smell 10: Primitive Obsession
// Using String/int for product type and status instead of proper Enums.
class Product {
    private String name;
    private double basePrice;
    private int quantity;
    private String productStatus; // e.g., "ACTIVE", "DISCONTINUED", "PROMO"
    private int productType;     // 1: Book, 2: Electronic, 3: Apparel

    // Smell 4: Data Clumps
    // basePrice, quantity, and productStatus often travel together in method calls.
    public Product(String name, double basePrice, int quantity, String productStatus, int productType) {
        this.name = name;
        this.basePrice = basePrice;
        this.quantity = quantity;
        this.productStatus = productStatus;
        this.productType = productType;
    }

    public double getBasePrice() { return basePrice; }
    public int getQuantity() { return quantity; }
    public String getProductStatus() { return productStatus; }
    public String getName() { return name; }
    public int getProductType() { return productType; }
    public void setProductStatus(String status) { this.productStatus = status; }
}


