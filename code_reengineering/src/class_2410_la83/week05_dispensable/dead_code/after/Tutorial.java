package class_2410_la83.week05_dispensable.dead_code.after;

public class Tutorial {
    public Tutorial() {
        calculate(100000);
        calculate(900000);
        method();
    }

    public double calculate(int harga) {
        return 1.1 * harga;
    }

    public void method() {
        concat("BINUS ", "University");
    }

    public String concat(String word1, String word2) {
        return word1.concat(word2);
    }

}
