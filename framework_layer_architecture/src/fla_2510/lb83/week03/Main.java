package fla_2510.lb83.week03;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.sleep();
        cat.sound();

        Dog dog = new Dog();
        dog.sleep();
        dog.sound();

        PaymentProcessor paymentProcessor = new PaymentProcessor() {
            @Override
            public void process() {
                System.out.println("Process");
            }
        };
        paymentProcessor.process();

        PaymentProcessor qris = new QRISPaymentProcessor();
        qris.process();
    }
}
