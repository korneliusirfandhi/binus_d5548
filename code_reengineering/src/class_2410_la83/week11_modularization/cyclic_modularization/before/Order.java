package class_2410_la83.week11_modularization.cyclic_modularization.before;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private long amount;
    private List<Item> items;

    public Order(int id, long amount, List<Item> items) {
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

    // cyclic depedency
    // Order
    //  ^ |
    //  | |
    //  | v
    // TaxCalculator
    // Suggested refactoring
    // - Option 1: Introduce an interface for one of the abstractions involved in the cycle.
    // - Option 2: In case one of the dependencies is unnecessary and can be safely removed, then remove that dependency. For instance, apply “move method” (and “move field”) refactoring to move the code that introduces cyclic dependency to one of the participating abstractions.
    // - Option 3: Move the code that introduces cyclic dependency to an altogether different abstraction.
    // - Option 4: In case the abstractions involved in the cycle represent a semantically single object, merge the abstractions into a single abstraction
    public double getAmount() {
        TaxCalculator taxCalculator = new TaxCalculator();
        return taxCalculator.computeAmount(this);
    }
}
