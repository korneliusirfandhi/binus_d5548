package class_2410_la83.week03_oo_abuser.alternative_class.before;

public class Employee {
    private long salary;

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public long bonusOnceSalary() {
        return salary;
    }

    public long bonusTwiceSalary() {
        return 2 * salary;
    }

    public long bonusFiveTimesSalary() {
        return 5 * salary;
    }
}
