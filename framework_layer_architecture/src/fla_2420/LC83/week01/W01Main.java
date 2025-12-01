package fla_2420.LC83.week01;

import java.util.Scanner;

public class W01Main {

    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.print("World");
        String namaKampus = "Bina Nusantara";
        System.out.printf("%s....\n\n", namaKampus);

        Scanner in = new Scanner(System.in);
        System.out.print("Nilai = ");
        int nilai = in.nextInt();
        System.out.println("Terima kasih, nilai Anda adalah " + nilai);

        in.nextLine();

        System.out.print("Nama = ");
        String nama = in.nextLine();
        System.out.println("Selamat datang, " + nama + " di Bina Nusantara");
    }
}
