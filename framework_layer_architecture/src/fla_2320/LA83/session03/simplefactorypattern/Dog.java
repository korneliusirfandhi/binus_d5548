package fla_2320.LA83.session03.simplefactorypattern;

public class Dog implements Animal {
    @Override
    public void speak() {
        System.out.println("Dog speak : Bow Bow");
    }

    @Override
    public void preferredAction() {
        System.out.println("Dog prefer barking.");
    }
}
