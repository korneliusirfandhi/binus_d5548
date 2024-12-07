package class_2410_lb83.week11_modularization.cyclic_dependent.before;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private double amount;
    private List<Item> items;

    public Order(int id, long amount) {
        this.id = id;
        this.amount = amount;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public int getId() {
        return id;
    }

    // cyclic dependency
    public double getAmount() {
        TaxCalculator taxCalculator = new TaxCalculator();
        return taxCalculator.computeAmount(this);
    }
}
