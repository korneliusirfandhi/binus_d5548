package class_2510_lc83.session10_encapsulation.deficient.before;

import java.util.ArrayList;
import java.util.List;

public class DeficientMain {

    public static void main(String[] args) {
        Employee employee = new Employee("Jane Doe", 150);
        employee.name = "Deficient Jane Doe";
        employee.salary = 350;

        List<String> initials = new ArrayList<>();
        initials.add("Jane");
        initials.add("Doe");

        EmployeeRoster employeeRoster = new EmployeeRoster(initials);
        List<String> employeeNames = employeeRoster.getEmployees();
        employeeNames.add("Maxx");
        employeeNames.remove("Jane");

    }
}
