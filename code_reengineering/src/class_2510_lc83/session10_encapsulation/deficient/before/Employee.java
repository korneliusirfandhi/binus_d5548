package class_2510_lc83.session10_encapsulation.deficient.before;

public class Employee {
    // deficient encapsulation -> expose public internal fields
    // fowler -> inappropriate intimacy
    public String name;
    public double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

}
