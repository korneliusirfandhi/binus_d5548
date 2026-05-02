package fla_2510.lb83.week06.prototype;

public abstract class IAcmePrototype implements Cloneable {
    protected String name;
    protected int id;
    protected String employeePIC;
    protected String dept;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeePIC() {
        return employeePIC;
    }

    public void setEmployeePIC(String employeePIC) {
        this.employeePIC = employeePIC;
    }

    public String getDept() {
        return dept;
    }

    public abstract void setDept(int dept);

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
