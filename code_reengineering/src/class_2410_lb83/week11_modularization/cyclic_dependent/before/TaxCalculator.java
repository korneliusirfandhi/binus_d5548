package class_2410_lb83.week11_modularization.cyclic_dependent.before;

public class TaxCalculator {

    // cyclic dependency (move method)
    public double computeAmount(Order order) {
        double amount = 0;
        for (Item item : order.getItems()) {
            amount += item.getCost();
        }
        return amount + calculateTax(amount);
    }

    public double calculateTax(double amount) {
        return 0.1 * amount;
    }
}
