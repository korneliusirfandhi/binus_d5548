package class_2510_lc83.session11_modularization.cyclically_dependent.before;

public class ProductService {
    private final InventoryService inventoryService = new InventoryService();

    public String getProductName(String productId) {
        return "Product " + productId;
    }

    public boolean isAvailable() {
        return inventoryService.getLowStock() > 0;
    }
}
