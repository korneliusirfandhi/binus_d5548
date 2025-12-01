package class_2510_lc83.session10_encapsulation.deficient.after;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeRoster {
    private List<String> employeeNames;

    public EmployeeRoster(List<String> names) {
        this.employeeNames = new ArrayList<>(names);
    }

    public void addEmployee(String name) {
        this.employeeNames.add(name);
    }

    public void removeEmployee(String name) {
        this.employeeNames.remove(name);
    }

    public List<String> getEmployees() {
        return Collections.unmodifiableList(employeeNames);
    }
}
