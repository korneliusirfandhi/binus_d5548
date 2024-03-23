package fla_2320.LA83.session06.prototypedesignpattern;

import java.util.Random;

public class Nano extends BasicCar {

    public Nano(String modelName) {
        super.setModelName(modelName);
        basePrice = 5000;
        onRoadPrice = basePrice + (new Random().nextInt(1000));
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return (Nano) super.clone();
    }

    @Override
    public String toString() {
        return "Model: " + getModelName() + "\nPrice: " + onRoadPrice;
    }
}
