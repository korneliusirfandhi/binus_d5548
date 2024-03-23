package fla_2320.LA83.session06.builderpattern;

public class MotorCycle extends Vehicle {
    String brandName;
    public MotorCycle(String brandName) {
        this.brandName = brandName;
        System.out.println("\nWe are about to make a " + brandName+ " motorcycle.");
    }
}
