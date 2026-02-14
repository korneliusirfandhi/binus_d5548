package fla_2510.lb80.week02.access_modifier;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.info();
        product.sampleNoAccessModifierMethod();

        Parent parent = new Parent();

        Child child = new Child();
        child.info();
        child.sampleNoAccessModifierMethod();
    }
}
