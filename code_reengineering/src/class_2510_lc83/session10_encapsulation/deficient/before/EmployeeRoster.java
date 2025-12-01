package class_2510_lc83.session10_encapsulation.deficient.before;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRoster {
    private List<String> employeeNames;

    public EmployeeRoster(List<String> names) {
        this.employeeNames = new ArrayList<>(names);
    }

    public List<String> getEmployees() {
        return employeeNames;
    }
}
