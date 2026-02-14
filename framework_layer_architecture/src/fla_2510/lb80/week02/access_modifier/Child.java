package fla_2510.lb80.week02.access_modifier;

public class Child extends Parent {
    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void info() {
        System.out.println("Polymorphism - Overriding Method.");
    }
}
