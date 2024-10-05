package class_2410_lb83.week03_oo_abuser.temporary_field.before;

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
