package fla_2510.la83.week06.prototype;

public class Client {
    private Marketing marketer;
    private Management manager;
    private Engineering engineer;

    public Client() throws CloneNotSupportedException {
        makeConProto();
        Marketing marketingEmployee = (Marketing) marketer.clone();
        setEmployee(marketingEmployee, "John Doe", "img/john_doe.png", 101, 1001);
        showEmployee(marketingEmployee);

        Marketing marketingEmployee2 = (Marketing) marketer.clone();
        setEmployee(marketingEmployee2, "Anna", "img/anna.png", 102, 1002);
        showEmployee(marketingEmployee2);

        Management managementEmployee3 = new Management();
        setEmployee(managementEmployee3, "Bob", "img/bob.png", 202, 2001);
        showEmployee(managementEmployee3);

        Management supervisor = (Management) manager.clone();
        setEmployee(supervisor, "Supervisor", "img/supervisor.png", 203, 2002);
        showEmployee(supervisor);

    }

    public void makeConProto() {
        this.manager = new Management();
        this.engineer = new Engineering();
        this.marketer = new Marketing();
    }

    public void showEmployee(IAcmeProtoype employee) {
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee PIC: " + employee.getEmployeePIC());
        System.out.println("Employee Dept: " + employee.getDept());
        System.out.println("Employee ID: " + employee.getId());
    }

    public void setEmployee(IAcmeProtoype employee, String name, String pic, int dept, int id) {
        employee.setName(name);
        employee.setEmployeePIC(pic);
        employee.setDept(dept);
        employee.setId(id);
    }

}
