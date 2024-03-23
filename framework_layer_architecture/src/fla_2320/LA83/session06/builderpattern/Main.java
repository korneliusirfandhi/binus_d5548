package fla_2320.LA83.session06.builderpattern;

public class Main {

    public static void main(String[] args) {
        Builder builder = new CarBuilder();
        Vehicle vehicle = builder
            .buildBody()
            .insertWheels()
            .addBrandName()
            .getVehicle();
        vehicle.showProduct();

        builder = new MotorCycleBuilder();
        vehicle = builder
            .buildBody()
            .insertWheels()
            .addBrandName()
            .getVehicle();
        vehicle.showProduct();
    }
}
