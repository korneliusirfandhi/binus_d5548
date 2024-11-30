package class_2410_la83.week08_abstraction.duplicate_abstraction.before;

public class Student {
    private String name, nim, major;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void belajar() {
        System.out.println("WAJIB BELAJAR");
    }
}
