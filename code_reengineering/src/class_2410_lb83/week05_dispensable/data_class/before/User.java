package class_2410_lb83.week05_dispensable.data_class.before;

public class User {
    private FullName fullName;
    private String username, email;
    public String phone; // need encapsulation

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
