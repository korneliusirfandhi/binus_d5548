package fla_2320.LA83.session06.prototypedesignpattern;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Prototype Demo Pattern\n");

        BasicCar nano = new Nano("Nano XM264 CC");

        // getting cloned version of nano
        BasicCar clonedCar = nano.clone();
        printCarDetail(clonedCar);

        System.out.println(nano.getModelName());

        System.out.println("-------\n");

        BasicCar ford = new Ford("Ford Aspire");
        clonedCar = ford.clone();
        printCarDetail(clonedCar);
    }

    private static void printCarDetail(BasicCar basicCar) {
        System.out.println("Editing a cloned model");
        System.out.println("Model: " + basicCar.getModelName());
        System.out.println("OTR Price: " + basicCar.onRoadPrice);
    }
}
