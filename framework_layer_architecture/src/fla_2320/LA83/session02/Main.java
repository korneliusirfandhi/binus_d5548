package fla_2320.LA83.session02;

public class Main {
    public static void main(String[] args) {
        // create object
        Mahasiswa andi = new Mahasiswa();
        andi.setNama("Andi");
        andi.setNim(1234567890L);
        andi.setGender("Male");

        System.out.println("Nama : " + andi.getNama());
        System.out.println("NIM : " + andi.getNim());
        System.out.println("Gender : " + andi.getGender());

        Jurusan jurusanSE = new Jurusan("Software Engineering", "SoCS");
        jurusanSE.setDekan("Deni");
        jurusanSE.setKajur("Ahmad");
//        jurusanSE.setNama("Computer Science");

        andi.setJurusan(jurusanSE);

        System.out.println("Jurusan : " + andi.getJurusan().getNama());
        System.out.println("Dekan : " + andi.getJurusan().getDekan());


        MahasiswaReguler mahasiswaReguler = new MahasiswaReguler();
        mahasiswaReguler.setNama(andi.getNama());
        mahasiswaReguler.setNim(andi.getNim());
        mahasiswaReguler.setJurusan(jurusanSE);
        System.out.println(mahasiswaReguler.getInfo(
            mahasiswaReguler.getNim(),
            mahasiswaReguler.getNama(),
            mahasiswaReguler.getJurusan()));
    }
}
