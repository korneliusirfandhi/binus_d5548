package class_2410_lb83.week05_dispensable.duplicate_code.after;

public class Mahasiswa extends Binusian {
    private String name, email, gender;

    public Mahasiswa(String binusianId, String name, String email, String gender) {
        super(binusianId); // pull up constructor body
        this.name = name;
        this.email = email;
        this.gender = gender;
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
