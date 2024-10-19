package class_2410_lb83.week05_dispensable.lazy_class.before;

// lazy class
public class BinusianValidator {
    public static boolean validateBinusianIdFormat(String binusianId) {
        return binusianId.matches("^[BN][0-9]{10}");
    }
}
