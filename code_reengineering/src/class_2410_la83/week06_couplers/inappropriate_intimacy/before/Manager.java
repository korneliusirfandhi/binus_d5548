package class_2410_la83.week06_couplers.inappropriate_intimacy.before;

public class Manager {
    private Employee employee; // inappropriate intimacy (replace delegation with inheritance)

    private String task;

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getNik() {
        return employee.getNik();
    }

    public String getName() {
        return employee.getName();
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
