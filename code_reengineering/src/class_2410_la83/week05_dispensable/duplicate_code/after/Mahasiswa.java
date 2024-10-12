package class_2410_la83.week05_dispensable.duplicate_code.after;

public class Mahasiswa extends Binusian {
    private String binusianId, name, email, gender, phone;

    public Mahasiswa(String binusianId, String name, String email, String gender, String phone) {
        super(binusianId);
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.phone = phone;
    }

    @Override
    public String getBinusianId() {
        return binusianId;
    }

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String categoryEmail() {
        String result;
        System.out.println("Email is categorized.");
        if (email.contains("@binus.ac.id")) {
            result = "Students";
        } else {
            result = "Non Students";
        }
        return result;
    }
}
