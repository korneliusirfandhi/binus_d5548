package class_2410_lb83.week06_couplers.inappropriate_intimacy.before;

import class_2410_lb83.week06_couplers.feature_envy.before.Employee;

public class Manager {
    private Employee employee; // inappropriate intimacy (replace delegation with inheritance)

    private String task;

    public String getNik() {
        return employee.getNik();
    }

    public String getName() {
        return employee.getName();
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
