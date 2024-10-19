package class_2410_lb83.week05_dispensable.dead_code.after;

public class Tutorial {
    public Tutorial() {
        calculate(100000);
        testMethod();
    }

    public double calculate(double harga) {
        return 1.1 * harga;
    }

    public void testMethod() {
        concat("BINUS ", "University");
    }

    public String concat(String word1, String word2) {
        return word1.concat(word2);
    }

}
