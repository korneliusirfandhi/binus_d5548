package class_2410_lc80.week03;

// inheritance -> pewarisan
// java hanya support single inheritance
// 1 class anak (subclass) hanya boleh punya 1 parent class
// java tidak allow untuk multiple inheritance
public class MountainBike extends Bicycle {
    private int seatHeight;

    public MountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        // merefer ke constructor parent
        // super -> apapun yg ada di parent
        this.seatHeight = seatHeight;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    // overriding method move() yg ada di class parent (class Bicycle)
    public void move() {
        System.out.println("MountainBike can move on extreme road..");
    }
}
