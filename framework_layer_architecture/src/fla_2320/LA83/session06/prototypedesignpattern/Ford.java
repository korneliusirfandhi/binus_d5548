package fla_2320.LA83.session06.prototypedesignpattern;

import java.util.Random;

public class Ford extends BasicCar {

    public Ford(String modelName) {
        super.setModelName(modelName);
        basePrice = 400000;
        onRoadPrice = basePrice + (new Random().nextInt(1000));
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return (Ford) super.clone();
    }

    @Override
    public String toString() {
        return "Model: " + getModelName() + "\nPrice: " + onRoadPrice;
    }
}
