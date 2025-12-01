package class_2510_lc83.session07_refactoring.before;

// Smell 5: Feature Envy / Smell 11: Inappropriate Intimacy
// This class is overly interested in the internal data of the Product class.
class ReportGenerator {

    // Should ask the Product to report its type or status, not access its raw data and re-interpret it.
    public String generateProductSummary(Product product) {

        // Excessive "getter" calls to extract internal data.
        String statusText = "";
        if (product.getProductStatus().equals("ACTIVE")) {
            statusText = "Currently Available";
        } else {
            statusText = "Status Unknown or Discontinued";
        }

        String typeName = "";
        if (product.getProductType() == 1) {
            typeName = "BOOK";
        } else if (product.getProductType() == 2) {
            typeName = "ELECTRONIC";
        } else {
            typeName = "OTHER GOODS";
        }

        double inventoryValue = product.getBasePrice() * product.getQuantity();

        return String.format("Summary: %s (%s). Type: %s. Value: $%.2f. Units: %d.",
            product.getName(), statusText, typeName, inventoryValue, product.getQuantity());
    }
}
