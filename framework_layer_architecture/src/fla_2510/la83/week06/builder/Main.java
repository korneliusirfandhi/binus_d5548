package fla_2510.la83.week06.builder;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder()
            .addTopping("Mozzarella")
            .setSize("Large")
            .setDough("Thin Crust")
            .setSauce("Tomato Basil")
            .addTopping("Pepperoni")
            .addTopping("Olives")
            .build();

        // without builder pattern, we would have to do something like this:
        // Pizza pizza = new Pizza();
        // pizza.setSize("Large");
        // pizza.setDough("Thin Crust");
        // pizza.setSauce("Tomato Basil");
        // List<String> toppings = new ArrayList<>();
        // toppings.add("Mozzarella");
        // toppings.add("Pepperoni");
        // toppings.add("Olives");
        // pizza.setToppings(toppings);

        System.out.println(pizza.toString());
    }
}
