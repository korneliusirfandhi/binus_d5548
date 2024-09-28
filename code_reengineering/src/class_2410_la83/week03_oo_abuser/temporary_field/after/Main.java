package class_2410_la83.week03_oo_abuser.temporary_field.after;

import class_2410_la83.week03_oo_abuser.temporary_field.before.Employee;

public class Main {

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        Employee employee = new Employee();
        employee.setSalary(5000000);
        System.out.println("Nett Income = " + employee.calculateNettIncome());
    }
}
