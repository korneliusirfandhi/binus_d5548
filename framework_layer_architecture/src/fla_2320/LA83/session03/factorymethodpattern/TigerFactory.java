package fla_2320.LA83.session03.factorymethodpattern;

public class TigerFactory extends AnimalFactory {

    @Override
    public Animal createAnimal() {
        return new Tiger();
    }
}
