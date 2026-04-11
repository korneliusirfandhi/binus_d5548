package fla_2510.lb83.week02.access_modifier;

public class Parent {
    private String nik, nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void info() {
        System.out.println("Method from Parent.");
    }

    void sampleNoAccessModifierMethod() {
        System.out.println("sampleNoAccessModifierMethod");
    }
}
