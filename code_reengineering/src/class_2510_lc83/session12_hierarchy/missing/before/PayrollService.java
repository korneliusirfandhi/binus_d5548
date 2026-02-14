package class_2510_lc83.session12_hierarchy.missing.before;

public class PayrollService {
    public double calculateBonus(Employee employee) {
        String status = employee.getStatus();
        double salary = employee.getSalary();
        double pay = 0.0;

        if ("FULL_TIME".equals(status)) {
            pay = 5000.0; // Fixed salary for full-time employees
        } else if ("PART_TIME".equals(status)) {
            pay = 2000.0; // Fixed salary for part-time employees
        } else if ("CONTRACTOR".equals(status)) {
            pay = 3000.0; // Fixed salary for contractors
        }

        return salary + pay;
    }

    public double calculateNettPay(Employee employee) {
        String status = employee.getStatus();
        double salary = employee.getSalary();
        double deductions = 0.0;

        if ("FULL_TIME".equals(status)) {
            deductions = 500.0; // Fixed salary for full-time employees
        } else if ("PART_TIME".equals(status)) {
            deductions = 200.0; // Fixed salary for part-time employees
        } else if ("CONTRACTOR".equals(status)) {
            deductions = 300.0; // Fixed salary for contractors
        }
        return salary - deductions;
    }

    // Other payroll related methods can be added here

}
