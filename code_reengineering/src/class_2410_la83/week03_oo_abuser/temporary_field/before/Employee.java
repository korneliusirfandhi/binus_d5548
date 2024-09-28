package class_2410_la83.week03_oo_abuser.temporary_field.before;

public class Employee {
    private String nik, name, email, gender, phone;
    private double salary;
    private double gross, nett, tax; // temporary field

    public double calculateNettIncome() {
        gross = getSalary();
        tax = 0.1 * gross;
        nett = gross - tax;
        return nett;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
