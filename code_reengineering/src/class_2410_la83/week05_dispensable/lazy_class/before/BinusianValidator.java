package class_2410_la83.week05_dispensable.lazy_class.before;

// lazy class
// hanya berisi 1 method saja, bahkan tidak ada sama sekali data attribute maupun method
// ada 1 method, combine ke class yg memanggilnya (jika hanya dipanggil oleh 1 class)
public class BinusianValidator {

    public static boolean validate(String binusianId) {
        return binusianId.matches("^[BN][0-9]{10}");
    }
}
