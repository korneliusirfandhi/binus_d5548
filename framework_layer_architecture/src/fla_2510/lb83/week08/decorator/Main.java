package fla_2510.lb83.week08.decorator;

public class Main {

    public static void main(String[] args) {
        Order order = new Product("Smartphone", 500.00);
        System.out.println("Order Detail: " + order.getDetail());
        System.out.println("Order Amount: " + order.getAmount());

        Order order2 = new Product("Wireless Charger", 100.00);
        order2 = new Protection(order2);
        order2 = new Packing(order2);
        order2 = new Packing(order2);
        System.out.println("Order Detail: " + order2.getDetail());
        System.out.println("Order Amount: " + order2.getAmount());


    }
}
