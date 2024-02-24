package fla_2320.LA83.session02;

// inheritance
// -> pewarisan sifat class parent (superclass) ke class child (subclass)
// hanya bisa memiliki 1 parent class di inheritance
// menggunakan keyword extends
// access modifier
public class MahasiswaReguler extends Mahasiswa {

    public String getInfo(Long nim, String nama, Jurusan jurusan) {
        super.setNim(nim); // super -> class parent
        super.setNama(nama);
        super.setJurusan(jurusan);
        return "Mahasiswa Reguler bernama "
            + getNama() + " (" + getNim() + ")"
            + " mengambil jurusan " + getJurusan().getNama();
    }

}
