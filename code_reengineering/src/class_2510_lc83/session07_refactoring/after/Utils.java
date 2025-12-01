package class_2510_lc83.session07_refactoring.after;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

// R9: Cleaned-up Utils (Addresses Duplicate Code, Dead Code, Excessive Comments - Smells 7, 8, 9)
class Utils {

    // R9.1: Factored out common logic into a parameterized method (Smell 7 - Duplicate Code fixed)
    private static List<String> processItems(List<String> items, Function<String, String> processor) {
        // R9.2: Removed excessive comment (Smell 9)
        List<String> result = new ArrayList<>();
        for (String item : items) {
            result.add(processor.apply(item));
        }
        return result;
    }

    // Public methods now simply call the refactored private method
    public static List<String> processA(List<String> items) {
        return processItems(items, item -> "PROC_A_" + item);
    }

    public static List<String> processB(List<String> items) {
        return processItems(items, item -> "PROC_B_" + item);
    }

    // R9.3: Dead Code (getUnusedData) removed (Smell 8)
}
