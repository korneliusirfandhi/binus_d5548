package week02.example02;

import java.util.ArrayList;

public class Kuliah {
    private ArrayList<Mahasiswa> mahasiswa;
    private Dosen dosen;
    private String mataKuliah;

    public ArrayList<Mahasiswa> getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(ArrayList<Mahasiswa> mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public Dosen getDosen() {
        return dosen;
    }

    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

}
