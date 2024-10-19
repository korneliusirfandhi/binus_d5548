package class_2410_la83.week06_couplers.before;

public class Employee {
    private String nik, name;

    // feature envy
    // -> ada method tapi lebih cenderung menggunakan data field dari class yg lain daripada class sendiri
    // -> refactor move method
    public String getContactInfo(Contact contact) {
        return "Email : " + contact.getEmail() + "\n"
            + "Phone : " + contact.getPhone();
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
