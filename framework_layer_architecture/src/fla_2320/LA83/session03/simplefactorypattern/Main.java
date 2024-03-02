package fla_2320.LA83.session03.simplefactorypattern;

public class Main {

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Animal animal = simpleFactory.createAnimal();
        animal.speak();
        animal.preferredAction();
    }
}
