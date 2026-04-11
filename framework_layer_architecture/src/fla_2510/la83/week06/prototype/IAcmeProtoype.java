package fla_2510.la83.week06.prototype;

public abstract class IAcmeProtoype implements Cloneable {
    protected String name, employeePIC, dept;
    protected int id;

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDept() {
        return dept;
    }

    public abstract void setDept(int dept);

    public String getEmployeePIC() {
        return employeePIC;
    }

    public void setEmployeePIC(String employeePIC) {
        this.employeePIC = employeePIC;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
