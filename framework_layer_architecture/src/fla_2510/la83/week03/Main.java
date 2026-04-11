package fla_2510.la83.week03;

import fla_2510.la83.week03.payment.QRISProcessor;
import fla_2510.la83.week03.payment.VirtualAccountProcessor;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.sleep();
        cat.sound();

        Dog dog = new Dog();
        dog.sleep();
        dog.sound();

        QRISProcessor qrisProcessor = new QRISProcessor();
        qrisProcessor.pay();

        VirtualAccountProcessor virtualAccountProcessor = new VirtualAccountProcessor();
        virtualAccountProcessor.pay();
    }
}
