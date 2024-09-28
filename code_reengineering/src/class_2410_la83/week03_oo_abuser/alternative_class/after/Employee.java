package class_2410_la83.week03_oo_abuser.alternative_class.after;

public class Employee {
    private long salary;

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public long bonus(long multiply) {
        return multiply * salary;
    }
}
