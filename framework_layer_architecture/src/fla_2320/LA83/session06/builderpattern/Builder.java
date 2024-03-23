package fla_2320.LA83.session06.builderpattern;

public interface Builder {
    Builder addBrandName();
    Builder buildBody();
    Builder insertWheels();
    Vehicle getVehicle();
}
