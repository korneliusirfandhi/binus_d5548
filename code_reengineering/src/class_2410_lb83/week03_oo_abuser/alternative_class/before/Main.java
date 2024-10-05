package class_2410_lb83.week03_oo_abuser.alternative_class.before;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setSalary(10000000);
        System.out.printf("%.2f\n", employee.oneHalfBonus());
        System.out.printf("%.2f\n", employee.threeTimesBonus());
    }
}
