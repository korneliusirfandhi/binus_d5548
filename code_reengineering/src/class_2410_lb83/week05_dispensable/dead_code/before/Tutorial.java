package class_2410_lb83.week05_dispensable.dead_code.before;

public class Tutorial {
    public Tutorial() {
        calculate(100000);
        testMethod();
    }

    public double calculate(double harga) {
        double hargaBaru = 0;
        if (harga < 50000) {
            hargaBaru = 0.95 * harga; // dead code
        } else {
            hargaBaru = 0.9 * harga; // dead code
        }
        hargaBaru = 1.1 * harga;
        return hargaBaru;
    }

    public void testMethod() {
        concat("BINUS ", "University", 10);
    }

    // dead code parameter : int angka
    public String concat(String word1, String word2, int angka) {
        String abc = "ABC"; // dead code (variable)
        return word1.concat(word2);
    }

    public void unusedMethod() {

    }
}
