package class_2410_lc80.week04;

// abstract class bisa berisikan :
// -> data field, common method, abstract method
public abstract class Geometry {
    public void information() {
        System.out.println("Info from abstract class Geometry..");
    }

    public abstract double luas();
    public abstract double keliling();
}
