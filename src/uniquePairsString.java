import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class uniquePairsString {

    public class UniqueStringPairs {

        public static void printUniquePairs(String[] array) {
            Set<String> uniquePairs = new HashSet<>();

            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    // Sort the pair to handle (a, b) and (b, a) as the same pair
                    String a = array[i];
                    String b = array[j];
                    String pair;

                    if (a.compareTo(b) < 0) {
                        pair = "(" + a + ", " + b + ")";
                    } else {
                        pair = "(" + b + ", " + a + ")";
                    }

                    uniquePairs.add(pair);
                }
            }

            // Print all unique pairs
            for (String pair : uniquePairs) {
                System.out.println(pair);
            }
        }

        public static void main(String[] args) {
            String[] array = {"apple", "banana", "apple", "cherry", "banana", "date", "cherry"};
            System.out.println("Unique pairs:");
            printUniquePairs(array);
        }
    }
}
