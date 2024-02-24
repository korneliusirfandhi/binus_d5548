package fla_2320.LA83.session02;

// class -> representasi umum
// - data attribute
// - behaviour / method
// abstraction -> encapsulation (information hiding)
// - data attribute di set access modifier private
// - access -> setter getter
public class Mahasiswa {
    // 1. set data attribute
    private Long nim;
    private String nama, gender;

    private Jurusan jurusan;

    public Jurusan getJurusan() {
        return jurusan;
    }

    public void setJurusan(Jurusan jurusan) {
        this.jurusan = jurusan;
    }

    // encapsulation - setter getter
    public Long getNim() {
        return nim;
    }

    public void setNim(Long nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
