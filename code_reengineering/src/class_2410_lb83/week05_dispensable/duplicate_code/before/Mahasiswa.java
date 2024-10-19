package class_2410_lb83.week05_dispensable.duplicate_code.before;

public class Mahasiswa extends Binusian {
    private String binusianId, name, email, gender;

    public Mahasiswa(String binusianId, String name, String email, String gender) {
        this.binusianId = binusianId; // duplicate code dengan constructor parent
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // duplicate code
    @Override
    public String getBinusianId() {
        return binusianId;
    }

    // duplicate code
    @Override
    public void setBinusianId(String binusianId) {
        this.binusianId = binusianId;
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
}
