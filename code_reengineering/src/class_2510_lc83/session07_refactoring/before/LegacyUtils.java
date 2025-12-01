package class_2510_lc83.session07_refactoring.before;

import java.util.ArrayList;
import java.util.List;

// Smell 8: Dead Code / Duplicate Code
public class LegacyUtils {

    // Smell 9: Excessive Comments (Trying to explain complex logic that isn't complex)

    /**
     * This important method processes a list of strings by adding a simple prefix.
     * It is critical for legacy systems and must not be deleted.
     *
     * @param items The list of input strings.
     * @return A list of processed strings.
     */
    public List<String> duplicateProcess(List<String> items) {
        List<String> result = new ArrayList<>();
        for (String item : items) {
            result.add("PROC_A_" + item);
        }
        return result;
    }

    // Smell 7: Duplicate Code (This method performs almost the exact same logic as duplicateProcess)
    public List<String> anotherProcess(List<String> items) {
        // Only difference is the prefix, violating DRY (Don't Repeat Yourself)
        List<String> output = new ArrayList<>();
        for (String item : items) {
            output.add("PROC_B_" + item);
        }
        return output;
    }

    // Smell 8: Dead Code
    // This method is defined but is never called anywhere in the codebase.
    private void getUnusedData(long id) {
        System.out.println("Fetching unused data for ID: " + id);
        // Imagine complex, unused database code here...
    }
}
