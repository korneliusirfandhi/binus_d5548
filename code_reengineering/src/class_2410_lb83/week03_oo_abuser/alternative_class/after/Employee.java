package class_2410_lb83.week03_oo_abuser.alternative_class.after;

public class Employee {
    private double salary;

    public double bonus(double multiply) {
        return multiply * salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
