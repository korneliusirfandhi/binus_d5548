package class_2410_la83.week06_couplers.feature_envy.after;

public class Employee {
    private String nik, name;

    public String getContactInfo(Contact contact) {
        return contact.getContactInfo();
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}