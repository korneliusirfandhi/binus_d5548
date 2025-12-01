package class_2510_lc83.session11_modularization.cyclically_dependent.before;

/*
cyclically dependent modularization smell

InventoryService    --------->  ProductService
InventoryService    <---------  ProductService

 */
public class InventoryService {
    private final ProductService productService = new ProductService();

    public String getProductName(String productName) {
        return productService.getProductName(productName);
    }

    public int getLowStock() {
        return 10;
    }
}
