package class_2410_lb83.week06_couplers.feature_envy.before;

public class Employee {
    private String nik, name;

    // feature envy
    // sebuah method yang lebih cenderung menggunakan data field dari class lain (data class) daripada dari class itu sendiri
    // refactor move method
    public String getContactInfo(Contact contact) {
        return "Email : " + contact.getEmail()
            + "\n" + "Phone : " + contact.getPhone();
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
