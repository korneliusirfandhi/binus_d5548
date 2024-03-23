package fla_2320.LA83.session06.builderpattern;

public class MotorCycleBuilder implements Builder {
    MotorCycle motorCycle;
    public MotorCycleBuilder() {
        motorCycle = new MotorCycle("Honda");
    }

    @Override
    public Builder addBrandName() {
        motorCycle.add(" Adding the motorCycle Brand: " + motorCycle.brandName);
        return this;
    }

    @Override
    public Builder buildBody() {
        motorCycle.add(" Making the motorCycle body.");
        return this;
    }

    @Override
    public Builder insertWheels() {
        motorCycle.add(" 2 wheels are added to the motorCycle.");
        return this;
    }

    @Override
    public Vehicle getVehicle() {
        return motorCycle;
    }
}
