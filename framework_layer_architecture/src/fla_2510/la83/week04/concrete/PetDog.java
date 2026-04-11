package fla_2510.la83.week04.concrete;

import fla_2510.la83.week04.interfaces.Dog;

public class PetDog implements Dog {
    @Override
    public void speak() {
        System.out.println("Pet dogs are known for their friendly and loyal nature, often communicating with barks, whines, and tail wagging.");
    }

    @Override
    public void preferredAction() {
        System.out.println("Pet dogs prefer to spend time with their owners, enjoying activities like playing fetch, going for walks, and cuddling.");
    }
}
