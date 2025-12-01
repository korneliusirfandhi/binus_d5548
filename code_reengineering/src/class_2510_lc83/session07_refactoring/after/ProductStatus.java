package class_2510_lc83.session07_refactoring.after;

// R1: Addressing Primitive Obsession (Smell 10)
enum ProductStatus {
    ACTIVE,
    DISCONTINUED,
    PROMO;

    // R6: Product now handles its own status interpretation (Addresses Feature Envy/Inappropriate Intimacy Smells 5 & 11)
    public String getDisplayStatus() {
        return this.equals(ACTIVE) ? "Currently Available" : "Status Unknown or Discontinued";
    }
}
