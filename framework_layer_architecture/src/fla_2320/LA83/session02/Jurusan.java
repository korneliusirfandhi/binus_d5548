package fla_2320.LA83.session02;

public class Jurusan {
    private String nama, fakultas, dekan, kajur;

    // user defined constructor
    public Jurusan(String nama, String fakultas) {
        this.nama = nama;
        this.fakultas = fakultas;
    }

    // by default -> Java construct
//    public Jurusan() {
//
//    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getDekan() {
        return dekan;
    }

    public void setDekan(String dekan) {
        this.dekan = dekan;
    }

    public String getKajur() {
        return kajur;
    }

    public void setKajur(String kajur) {
        this.kajur = kajur;
    }
}
