package fla_2510.lb83.week06.prototype;

public class Client {
    private Marketing marketer;
    private Management manager;
    private Engineering engineer;

    public Client() throws CloneNotSupportedException {
        makeConProto();
        Marketing tess = (Marketing) marketer.clone();
        Marketing tess2 = (Marketing) tess.clone();
        setEmployee(tess, "Tess Smith", 101, 1234, "tess.jpg");
        setEmployee(tess2, "Tess2 Smith", 102, 2345, "tess2.jpg");
        showEmployee(tess);
        showEmployee(tess2);

        // without prototype design pattern
        Marketing tess3 = new Marketing();
        tess3.setName("Tess3 Smith");
        tess3.setDept(103);
        tess3.setId(3456);
        tess3.setEmployeePIC("tess3.jpg");
        System.out.println("Name: " + tess3.getName());
        System.out.println("Dept: " + tess3.getDept());
        System.out.println("ID: " + tess3.getId());

        Marketing tess4 = new Marketing();
        tess4.setName("Tess4 Smith");
        tess4.setDept(104);
        tess4.setId(4567);
        tess4.setEmployeePIC("tess4.jpg");
        System.out.println("Name: " + tess4.getName());
        System.out.println("Dept: " + tess4.getDept());
        System.out.println("ID: " + tess4.getId());

    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Client client = new Client();
    }

    public void makeConProto() {
        this.marketer = new Marketing();
        this.manager = new Management();
        this.engineer = new Engineering();
    }

    public void showEmployee(IAcmePrototype employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Dept: " + employee.getDept());
        System.out.println("ID: " + employee.getId());
    }

    public void setEmployee(IAcmePrototype current, String name, int dept, int id, String pic) {
        current.setName(name);
        current.setDept(dept);
        current.setId(id);
        current.setEmployeePIC(pic);
    }
}
