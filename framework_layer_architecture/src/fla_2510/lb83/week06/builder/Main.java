package fla_2510.lb83.week06.builder;

public class Main {

    public static void main(String[] args) {
        Pizza pizza = new Pizza.PizzaBuilder()
                .setSauce("Tomato Basil")
                .setTopping("Pepperoni")
                .setExtraCheese(true)
                .setBread("Thin Crust")
                .build();

        System.out.println("Pizza created with:");
        System.out.println("Bread: " + pizza.getBread());
        System.out.println("Sauce: " + pizza.getSauce());
        System.out.println("Topping: " + pizza.getTopping());
        System.out.println("Extra Cheese: " + pizza.isExtraCheese());
    }
}
