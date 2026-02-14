package fla_2510.la80.week02.binus;

import fla_2510.la80.week02.Binusian;

public class Mahasiswa extends Binusian {
    private int nim;
    private String nama, jurusan, gender;
    private double ipk;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    protected void displayInfo() {
        System.out.println("You're not allowed to access this.");
    }
}
