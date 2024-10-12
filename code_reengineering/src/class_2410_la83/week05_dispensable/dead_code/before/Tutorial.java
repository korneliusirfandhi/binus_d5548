package class_2410_la83.week05_dispensable.dead_code.before;

public class Tutorial {
    public Tutorial() {
        calculate(100000);
        calculate(900000);
        method();
    }

    public double calculate(int harga) {
        double hargaBaru = 0;
        if (harga < 500000) {
            hargaBaru = 0.95 * harga; // dead code (expression)
        } else {
            hargaBaru = 0.9 * harga; // dead code (expression)
        }
        hargaBaru = 1.1 * harga;
        return hargaBaru;
    }

    public void method() {
        concat("BINUS ", "University", 10);
    }

    public String concat(String word1, String word2, int angka) { // dead code (parameter)
        String deadVariable = "Dead variable";
        return word1.concat(word2);
    }

    // dead code (unused method)
    public void methodKosong() {

    }
}
