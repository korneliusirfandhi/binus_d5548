package class_2410_la83.week08_abstraction.duplicate_abstraction.before;

// duplicate abstraction -> kemiripan dengan class lain
// (fowler duplicate code)
// remove code
public class Mahasiswa {
    private String nim, name, major;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void study() {
        System.out.println("WAJIB BELAJAR");
    }
}
