package class_2510_lc83.session10_encapsulation.deficient.after;


import java.util.ArrayList;
import java.util.List;

public class DeficientMain {

    public static void main(String[] args) {
        Employee employee = new Employee("Jane Doe", 150);
        employee.setName("New Jane Doe");
        employee.setSalary(350);

        List<String> initials = new ArrayList<>();
        initials.add("Jane");
        initials.add("Doe");

        EmployeeRoster employeeRoster = new EmployeeRoster(initials);
        employeeRoster.addEmployee("Maxx");
        employeeRoster.removeEmployee("Jane");

        List<String> employeeNames = employeeRoster.getEmployees();
        employeeNames.add("Zoe");
        employeeNames.remove("Maxx");
    }
}
