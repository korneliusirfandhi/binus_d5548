package fla_2510.la83.week08.decorator;

public class Main {
    public static void main(String[] args) {
        Order order = new Product("Item One", 20000.0);
        System.out.println(order.getInfo() + " = " + order.getPrice());

        order = new Packing(order);
        System.out.println(order.getInfo() + " = " + order.getPrice());

        order = new Protection(order);
        System.out.println(order.getInfo() + " = " + order.getPrice());


    }
}
