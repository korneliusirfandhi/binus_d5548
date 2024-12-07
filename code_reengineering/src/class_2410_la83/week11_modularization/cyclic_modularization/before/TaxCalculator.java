package class_2410_la83.week11_modularization.cyclic_modularization.before;

public class TaxCalculator {

    // cyclic dependency
    public double computeAmount(Order order) {
        double amount = 0;
        for (Item item : order.getItems()) {
            amount += item.getCost();
        }
        return amount + computeTax(amount);
    }

    public double computeTax(double amount) {
        return 0.1 * amount;
    }
}
