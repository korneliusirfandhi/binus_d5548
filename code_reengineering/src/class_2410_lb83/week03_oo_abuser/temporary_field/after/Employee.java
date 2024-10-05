package class_2410_lb83.week03_oo_abuser.temporary_field.after;

public class Employee {
    private String nik, name, email, gender, phone;
    private double salary;

    public double calculateNettIncome() {
        IncomeCalculator calculator = new IncomeCalculator();
        calculator.setGross(salary);
        calculator.setTax(0.1 * calculator.getGross());
        calculator.setNett(calculator.getGross() - calculator.getTax());
        return calculator.getNett();
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
