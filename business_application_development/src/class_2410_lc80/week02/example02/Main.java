package class_2410_lc80.week02.example02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        dosen.setKode("D0001");
        dosen.setNama("Dosen Muda Mudi");

        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.setNim("1200000001");
        mahasiswa1.setNama("Mahasiswa Idola");
        mahasiswa1.setIpk(4.00);
        mahasiswa1.setJurusan("Business Information Technology");
        mahasiswa1.setSemester(3);

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.setNim("1200000002");
        mahasiswa2.setNama("Mahasiswi Idola");
        mahasiswa2.setIpk(3.99);
        mahasiswa2.setJurusan("Business Information Technology");
        mahasiswa2.setSemester(3);

        Kuliah kuliah = new Kuliah();
        kuliah.setMataKuliah("Business Application Development");
        kuliah.setDosen(dosen);

        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();
        listMahasiswa.add(mahasiswa1);
        listMahasiswa.add(mahasiswa2);

        kuliah.setMahasiswa(listMahasiswa);

        System.out.println("Mata Kuliah = " + kuliah.getMataKuliah());
        System.out.printf("Dosen = %s - %s\n",
            kuliah.getDosen().getKode(),
            kuliah.getDosen().getNama());
        System.out.println("Dosen = "
            + kuliah.getDosen().getKode()
            + " - "
            + kuliah.getDosen().getNama());

        for (Mahasiswa mahasiswa : kuliah.getMahasiswa()) {
            System.out.printf("Mahasiswa %s, Semeter %d, IPK %.2f\n",
                mahasiswa.getNama(),
                mahasiswa.getSemester(),
                mahasiswa.getIpk()
            );
        }
    }
}
