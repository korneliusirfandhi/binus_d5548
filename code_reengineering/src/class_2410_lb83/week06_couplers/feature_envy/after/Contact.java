package class_2410_lb83.week06_couplers.feature_envy.after;

public class Contact {
    private String email, phone;

    public String getContactInfo() {
        return "Email : " + email
            + "\n" + "Phone : " + phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
