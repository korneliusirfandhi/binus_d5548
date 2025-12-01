package class_2510_lc83.session06_couplers.message_chain.before;

public class Employee {
    private String name;
    private Office office;

    public Employee(String name, Office office) {
        this.name = name;
        this.office = office;
    }

    public String getName() {
        return name;
    }

    public Office getOffice() {
        return office;
    }
}
