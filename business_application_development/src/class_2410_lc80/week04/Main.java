package class_2410_lc80.week04;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        ArrayList<Square> listSquare = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        System.out.print("Jumlah Data : ");
        int data = in.nextInt();

        for (int i=0; i<data; i++) {
            Square square = new Square();
            System.out.print("-> Sisi Persegi : ");
            double sisi = in.nextDouble();
            square.setSisi(sisi);
            listSquare.add(square);
        }

        System.out.println("===========================");
        System.out.println("Size of listSquare = " + listSquare.size());

        for (Square square : listSquare) {
            System.out.println("===========================");
            System.out.println("Sisi     = " + square.getSisi());
            System.out.println("Luas     = " + square.luas());
            System.out.println("Keliling = " + square.keliling());
        }

        listSquare.remove(listSquare.size() - 1); // remove last index
        System.out.println("===========================");
        System.out.println("Size of listSquare after remove = " + listSquare.size());

        for (Square square : listSquare) {
            System.out.println("===========================");
            System.out.println("Sisi     = " + square.getSisi());
            System.out.println("Luas     = " + square.luas());
            System.out.println("Keliling = " + square.keliling());
        }
    }
}
