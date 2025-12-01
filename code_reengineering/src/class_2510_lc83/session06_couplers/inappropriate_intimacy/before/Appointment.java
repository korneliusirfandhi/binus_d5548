package class_2510_lc83.session06_couplers.inappropriate_intimacy.before;

public class Appointment {
    public boolean canDoAppointment(Patient patient) {
        // inappropriate intimacy
        if (patient.age < 18 && !patient.insurance) {
            // ....
            return false;
        }
        return true;
    }
}
