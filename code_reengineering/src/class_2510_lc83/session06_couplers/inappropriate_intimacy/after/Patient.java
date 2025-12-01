package class_2510_lc83.session06_couplers.inappropriate_intimacy.after;

public class Patient {
    private String name;
    private int age;
    private boolean insurance;

    public Patient(int age, boolean insurance, String name) {
        this.age = age;
        this.insurance = insurance;
        this.name = name;
    }

    public boolean canDoAppointment() {
        if (age < 18 && !insurance) {
            // ....
            return false;
        }
        return true;
    }

}
