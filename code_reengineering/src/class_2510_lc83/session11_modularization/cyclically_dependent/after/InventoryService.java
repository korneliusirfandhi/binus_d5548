package class_2510_lc83.session11_modularization.cyclically_dependent.after;

public class InventoryService {
    public int getLowStock() {
        return 10;
    }

    public boolean isAvailable() {
        return getLowStock() > 0;
    }

}
