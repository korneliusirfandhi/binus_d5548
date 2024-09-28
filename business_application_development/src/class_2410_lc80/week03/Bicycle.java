package class_2410_lc80.week03;

public class Bicycle {
    private int gear, speed;

    // user defined constructor
    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    protected void protectedInfo() {
        System.out.println("Bicycle.protectedInfo()");
    }

    void noAccessModifier() {
        System.out.println("Bicycle.noAccessModifier()");
    }

    public void move() {
        System.out.println("Bicycle can move...");
    }
}
