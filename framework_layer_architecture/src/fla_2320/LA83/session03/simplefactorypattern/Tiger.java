package fla_2320.LA83.session03.simplefactorypattern;

public class Tiger implements Animal {

    @Override
    public void speak() {
        System.out.println("Tiger speak : Halum");
    }

    @Override
    public void preferredAction() {
        System.out.println("Tiger prefer hunting.");
    }
}
