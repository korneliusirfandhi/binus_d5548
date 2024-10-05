package class_2410_lb83.week03_oo_abuser.alternative_class.before;

public class Employee {
    private double salary;

    public double onceBonus() {
        return salary;
    }

    public double oneHalfBonus() {
        return 1.5 * salary;
    }

    public double threeTimesBonus() {
        return 3 * salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
