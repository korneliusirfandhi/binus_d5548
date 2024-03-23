package fla_2320.LA83.session06.prototypedesignpattern;

public abstract class BasicCar implements Cloneable {
    private String modelName;
    public int basePrice = 0, onRoadPrice = 0;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public BasicCar clone() throws CloneNotSupportedException {
        return (BasicCar) super.clone();
    }
}
